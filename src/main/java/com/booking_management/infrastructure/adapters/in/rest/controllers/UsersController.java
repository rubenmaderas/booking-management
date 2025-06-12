package com.booking_management.infrastructure.adapters.in.rest.controllers;

import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.out.persistence.h2.entity.UserEntity;
import com.booking_management.infrastructure.adapters.out.persistence.h2.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UsersController {

    private final UsersRepository usersRepository;

    // Example method to create a new user
    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel userModel) throws Exception {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(userModel.getName());
        userEntity.setEmail(userModel.getEmail());
        userEntity.setRole(userModel.getRole());

        usersRepository.save(userEntity);

        return Optional.of(userModel)
                .orElseThrow(() -> new IllegalArgumentException("User model cannot be null"));
    }
}
