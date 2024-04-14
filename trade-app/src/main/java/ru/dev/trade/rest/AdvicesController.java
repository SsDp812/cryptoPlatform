package ru.dev.trade.rest;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advices")
public class AdvicesController {

    @PostMapping(value = "/getAdvices")
    public void getAdvices(){

    }
}
