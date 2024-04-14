package ru.dev.trade.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @PostMapping(value = "/getMyLimitOrders")
    public void getAllMyOpenLimitOrders(){

    }

    @PostMapping(value = "/cancelLimitOrder")
    public void cancelLimitOrder(){

    }

    @PostMapping(value = "/makeOrder")
    public void makeOrder(){

    }
}
