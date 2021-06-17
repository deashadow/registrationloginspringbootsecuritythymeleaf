package com.rendessy.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rendessy.model.User;
import com.rendessy.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
