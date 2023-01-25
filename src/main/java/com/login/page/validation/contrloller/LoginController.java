package com.login.page.validation.contrloller;

import com.login.page.validation.entity.Credentials;
import com.login.page.validation.entity.LoginEntity;
import com.login.page.validation.service.LoginService;
import com.login.page.validation.service.ValidateCredentialsService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class LoginController {
    @Autowired
    private LoginService service;

    @Autowired
    private ValidateCredentialsService validateService;

    @GetMapping("/Login-Details")

    public List<LoginEntity> getDetails(){
         return service.getDetails();
    }

    @PostMapping("/Login-Details")
    public  String validateDetails(@RequestBody @NotNull Credentials credentials){

        return validateService.validateCredentials(credentials);
    }
}
