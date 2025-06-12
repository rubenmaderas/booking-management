package com.booking_management.application.port.in;

import com.booking_management.domain.models.UserModel;

import java.util.Optional;

public interface SaveUser {

    Optional<UserModel> saveUser(UserModel user) throws Exception;
}
