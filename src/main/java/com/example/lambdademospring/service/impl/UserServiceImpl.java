package com.example.lambdademospring.service.impl;

import com.example.lambdademospring.dao.UserRepository;
import com.example.lambdademospring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<String> getAllUsers() {
       return userRepository.getAllUsers();
    }
}
