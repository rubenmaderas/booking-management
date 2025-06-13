package com.booking_management.infrastructure.adapters.inbound.controllers;

import com.booking_management.application.usecases.IGetUserById;
import com.booking_management.infrastructure.adapters.inbound.dto.UserResponseDto;
import com.booking_management.infrastructure.adapters.inbound.mappers.UserDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/v1")
public class UserController {

    private final IGetUserById IGetUserById;
    private final UserDtoMapper userDtoMapper;

    @GetMapping("/user/{userId}")
    public UserResponseDto getUserById(@PathVariable Long userId) {

        return IGetUserById.getUserById(userId)
                .map(userDtoMapper::toDto)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
