package com.login.page.validation.service;

import com.login.page.validation.entity.LoginEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {
    public List<LoginEntity> getDetails();
}
