package ru.dev.trade.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coins")
public class CoinController {

    @PostMapping(value = "/getAvailablePairs")
    public void getAvailablePairs(){

    }
}
