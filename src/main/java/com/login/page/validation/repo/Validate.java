package com.login.page.validation.repo;

import com.login.page.validation.entity.Credentials;
import com.login.page.validation.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Validate extends JpaRepository<LoginEntity, Integer> {
    @Query(nativeQuery = true, value="select username,password from formvalidation where username=:username and password=:password")
    public List findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
