package com.example.lambdademospring.dao.impl;

import com.example.lambdademospring.dao.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<String> getAllUsers() {
        return List.of("Serhii", "Nazar", "Anastasiia", "Oksana");
    }
}
