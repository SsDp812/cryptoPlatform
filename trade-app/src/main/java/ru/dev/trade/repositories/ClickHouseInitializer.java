package ru.dev.trade.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.dev.trade.repositories.base.BaseDbConnector;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class ClickHouseInitializer extends BaseDbConnector {
    @Value("${app.conf.db.test-script-path}")
    private String filePathToTestScript;

    @Value("${app.conf.db.init-script-path}")
    private String filePathToInitScript;

    @PostConstruct
    private void initClickHouse() {
        if (filePathToInitScript != null && filePathToTestScript != null) {
            try (Connection connection = getConnection()) {
                String sqlQuery = Files.readString(Paths.get(filePathToInitScript));
                String testQuery = Files.readString(Paths.get(filePathToTestScript));
                Statement statement = connection.createStatement();
                boolean testRes = statement.execute(testQuery);
                if(testRes && statement.getResultSet().getInt(0) > 0){
                    statement.execute(sqlQuery);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
