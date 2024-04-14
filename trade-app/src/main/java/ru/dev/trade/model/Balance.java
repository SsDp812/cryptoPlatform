package ru.dev.trade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Balance {
    private String guid;
    private Double currency;


    private String accountId;
    private Account account;
}
