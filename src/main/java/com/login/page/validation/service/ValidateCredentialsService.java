package com.login.page.validation.service;

import com.login.page.validation.entity.Credentials;
import com.login.page.validation.entity.LoginEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ValidateCredentialsService {
    public ResponseEntity<String> validateCredentials(Credentials credentials);
}
