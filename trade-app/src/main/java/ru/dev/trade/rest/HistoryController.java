package ru.dev.trade.rest;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @PostMapping(value = "/myHistories")
    public void getOrdersHistory(){

    }
}
