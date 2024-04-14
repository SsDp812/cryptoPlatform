package ru.dev.trade.repositories.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class BaseDbConnector {

    @Value("${app.conf.db.url}")
    private String dbUrl;
    @Value("${app.conf.db.username}")
    private String dbUserName;
    @Value("${app.conf.db.password}")
    private String dbPassword;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
    }
}
