package ru.dev.trade.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.dev.trade.model.enums.OrderOperation;
import ru.dev.trade.model.enums.OrderState;
import ru.dev.trade.model.enums.OrderType;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HistoryOrder {
    private String guid;
    private Double currency;
    private Coin coinFrom;
    private Coin coinTo;
    private Double price;
    private OrderOperation orderOperation;
    private LocalDateTime dateTime;
    private OrderState orderState;
    private OrderType orderType;


    private String accountId;
    private Account account;
}
