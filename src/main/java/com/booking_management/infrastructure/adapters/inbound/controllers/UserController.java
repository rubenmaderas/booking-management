package com.booking_management.infrastructure.adapters.inbound.controllers;

import com.booking_management.application.usecases.GetUserById;
import com.booking_management.infrastructure.adapters.inbound.dto.UserResponseDTO;
import com.booking_management.infrastructure.adapters.inbound.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/v1")
public class UserController {

    private final GetUserById getUserById;
    private final UserMapper userMapper;

    @GetMapping("/user/{userId}")
    public UserResponseDTO getUserById(@PathVariable Long userId) {

        return getUserById.getUserById(userId)
                .map(userMapper::toDto)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
