package com.login.page.validation.repo;

import com.login.page.validation.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<LoginEntity, Integer>{
}
