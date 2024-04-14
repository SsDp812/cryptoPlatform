package ru.dev.trade.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.dev.trade.model.enums.OrderOperation;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LimitOrder {
    private String guid;
    private Coin coinFrom;
    private Coin coinTo;
    private Double currencyToWant;
    private Double priceToWant;
    private OrderOperation orderOperation;
    private LocalDateTime dateTime;
    private String accountId;


    private Account account;
}
