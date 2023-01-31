package com.login.page.validation.contrloller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
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

    @GetMapping("/Login-Details1")

    public List<LoginEntity> getDetails(){
         return service.getDetails();
    }

    @PostMapping("/Login-Details")
    public ObjectNode validateDetails(@RequestBody @NotNull Credentials credentials){
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode node = objectMapper.createObjectNode();
        JsonNode innerNode = objectMapper.createObjectNode();
        ((ObjectNode)innerNode).put("APIResponse", validateService.validateCredentials(credentials));
        node.set("Result",innerNode);
        return node;
    }
}
