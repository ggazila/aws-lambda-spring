package com.example.lambdademospring;

import com.example.lambdademospring.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class LambdaDemoSpringApplication {

    private final UserService service;

    public LambdaDemoSpringApplication(UserService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(LambdaDemoSpringApplication.class, args);
    }

    @Bean
    public Function<Object, String> myCustomBean() {
        return o -> {
            List<String> allUsers = service.getAllUsers();
            return "Success...." + allUsers;
        };
    }

}
