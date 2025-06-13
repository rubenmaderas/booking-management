package com.booking_management.application.services;

import com.booking_management.application.usecases.IGetUserById;
import com.booking_management.domain.models.UserModel;
import com.booking_management.domain.repository.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GetUserByIdImpl implements IGetUserById {

    private final UserRepositoryPort userRepositoryPort;

    @Override
    public Optional<UserModel> getUserById(Long id) {
        return userRepositoryPort.getUserById(id);
    }
}
