package com.login.page.validation.contrloller;

import com.login.page.validation.entity.LoginEntity;
import com.login.page.validation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class LoginController {
    @Autowired
    private LoginService service;

    @GetMapping("/Login-Details")

    public List<LoginEntity> getDetails(){
        return service.getDetails();
    }
}
