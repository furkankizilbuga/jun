package com.ecomm.jun.service;

import com.ecomm.jun.dto.UserDto;
import com.ecomm.jun.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserDto> findAll();
    User findById(Long id);
    User findByEmail(String email);
    UserDto save(User user);
    UserDto delete(Long id);
    String getAuthenticatedEmail();

}
