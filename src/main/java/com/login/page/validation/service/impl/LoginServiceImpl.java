package com.login.page.validation.service.impl;

import com.login.page.validation.entity.LoginEntity;
import com.login.page.validation.repo.LoginRepo;
import com.login.page.validation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo repo;

    @Override
    public List<LoginEntity> getDetails() {
        return repo.findAll();
    }
}
