package com.login.page.validation.service.impl;

import com.login.page.validation.entity.Credentials;
import com.login.page.validation.repo.LoginRepo;
import com.login.page.validation.repo.Validate;
import com.login.page.validation.service.ValidateCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidateCredentialsServiceImpl implements ValidateCredentialsService {

    @Autowired
    private LoginRepo repo;

    @Autowired
    private Validate validateRepo;

    public List<Credentials> result1;
       @Override
    public String validateCredentials(Credentials credentials) {
        result1 = (List<Credentials>) validateRepo.findByUsernameAndPassword(credentials.username, credentials.password);
        if(result1.isEmpty()){
            return "Not Success";
        } else{
            return "Success";
        }
    }
}
