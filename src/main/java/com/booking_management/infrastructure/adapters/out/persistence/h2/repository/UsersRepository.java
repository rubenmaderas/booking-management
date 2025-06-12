package com.booking_management.infrastructure.adapters.out.persistence.h2.repository;

import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.out.persistence.h2.entity.UserEntity;

import java.util.Optional;

public interface UsersRepository {

    /**
     * Saves a user model to the data store.
     *
     * @param userEntityr the user entity to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    UserEntity save(UserEntity userEntityr) throws Exception;

    /**
     * Retrieves a user by their ID.
     *
     * @param id the ID of the user to retrieve
     * @return an Optional containing the user model if found, or empty if not found
     * @throws Exception if an error occurs during retrieval
     */
    Optional<UserModel> getUserById(Long id) throws Exception;
}
