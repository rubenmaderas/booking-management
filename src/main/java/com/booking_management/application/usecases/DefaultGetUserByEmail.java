package com.booking_management.application.usecases;

import com.booking_management.application.port.in.GetUserByEmail;
import com.booking_management.domain.models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultGetUserByEmail implements GetUserByEmail {

    @Override
    public Optional<UserModel> getUserByEmail(String email) throws Exception {
        return Optional.empty();
    }
}
