package com.login.page.validation.service.impl;

import com.login.page.validation.entity.Credentials;
import com.login.page.validation.repo.LoginRepo;
import com.login.page.validation.repo.Validate;
import com.login.page.validation.service.ValidateCredentialsService;
//import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;

import java.util.Base64;
@Service
public class ValidateCredentialsServiceImpl implements ValidateCredentialsService {

    @Autowired
    private LoginRepo repo;

    @Autowired
    private Validate validateRepo;

    public List<Credentials> result1;
       @Override
    public ResponseEntity<String> validateCredentials(Credentials credentials) {
           //byte[] userName = Base64.decodeBase64(credentials.username);
           byte[] userName =  Base64.getDecoder().decode(credentials.username);
           String decodedUserName = new String(userName, StandardCharsets.UTF_8);
          // byte[] pwd = Base64.decodeBase64(credentials.password);
           byte[] pwd = Base64.getDecoder().decode(credentials.password);
           String decodedPassword = new String(pwd, StandardCharsets.UTF_8);

           System.out.println("decoded username-->" + decodedUserName +  "decoded pwd-->" + decodedPassword);
           //result1 = (List<Credentials>) validateRepo.findByUsernameAndPassword(credentials.username, credentials.password);
           result1 = (List<Credentials>) validateRepo.findByUsernameAndPassword(decodedUserName, decodedPassword);
        if(result1.isEmpty()){
            return ResponseEntity.badRequest().body("Not Success");
        } else{
            return ResponseEntity.ok().body("Success");
        }
    }
}
