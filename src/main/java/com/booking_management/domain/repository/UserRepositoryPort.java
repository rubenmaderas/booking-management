package com.booking_management.domain.repository;

import com.booking_management.domain.models.UserModel;

import java.util.Optional;

public interface UserRepositoryPort {

    Optional<UserModel> getUserById(Long id);
}
