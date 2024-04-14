package ru.dev.trade.rest;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping(value = "/generateNotifierCode")
    public void generateHashCodeForNotificationService(){

    }
}
