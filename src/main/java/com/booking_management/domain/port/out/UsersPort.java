package com.booking_management.domain.port.out;

import com.booking_management.domain.models.UserModel;

import java.util.Optional;

public interface UsersPort {

    /**
     * Saves a user model to the data store.
     *
     * @param userModel the user model to save
     * @return the saved user model
     * @throws Exception if an error occurs during saving
     */
    UserModel save(UserModel userModel) throws Exception;

    /**
     * Retrieves a user by their email address.
     *
     * @param email the email address of the user to retrieve
     * @return an Optional containing the UserModel if found, or empty if not found
     * @throws Exception if an error occurs during retrieval
     */
    Optional<UserModel> getUserByEmail(String email) throws Exception;
}
