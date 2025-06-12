package com.booking_management.application.services;

import com.booking_management.application.usecases.GetUserById;
import com.booking_management.domain.models.UserModel;
import com.booking_management.domain.repository.PortUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultGetUserById implements GetUserById {

    private final PortUserRepository portUserRepository;

    @Override
    public Optional<UserModel> getUserById(Long id) {
        return portUserRepository.getUserById(id);
    }
}
