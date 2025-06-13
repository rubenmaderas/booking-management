package com.booking_management.application.usecases;

import com.booking_management.domain.models.UserModel;

import java.util.Optional;

public interface IGetUserById {

    Optional<UserModel> getUserById(Long id);
}
