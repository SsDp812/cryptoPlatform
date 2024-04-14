package ru.dev.trade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private String guid;
    private String userName;
    private String password;
    private Set<Long> balancesIds;


    private Set<Balance> balances;
}
