package ru.dev.trade.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dev.trade.commons.BaseDataResponse;
import ru.dev.trade.dto.auth.RegisterDto;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping(value = "/register")
    public BaseDataResponse<?> register(@RequestBody RegisterDto registerDto){
        return null;
    }
}
