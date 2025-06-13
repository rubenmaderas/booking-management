package com.booking_management.infrastructure.adapters.inbound.controllers;

import com.booking_management.application.usecases.IGetUserById;
import com.booking_management.application.usecases.ISaveUser;
import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.inbound.dto.UserResponseDto;
import com.booking_management.infrastructure.adapters.inbound.mappers.UserDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/v1")
public class UserController {

    private final IGetUserById iGetUserById;
    private final UserDtoMapper userDtoMapper;

    @GetMapping("/user/{userId}")
    public UserResponseDto getUserById(@PathVariable Long userId) {

        return iGetUserById.getUserById(userId)
                .map(userDtoMapper::toDto)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

}
