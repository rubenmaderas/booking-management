package com.booking_management.application.usecases;

import com.booking_management.application.port.in.SaveUser;
import com.booking_management.domain.models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DefaultSaveUser implements SaveUser {

    @Override
    public Optional<UserModel> saveUser(UserModel user) throws Exception {
        return Optional.empty();
    }
}
