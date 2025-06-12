package com.booking_management.application.port.in;

import com.booking_management.domain.models.UserModel;

import java.util.Optional;

public interface GetUserByEmail {

    /**
     * Retrieves a user by their email address.
     *
     * @param email the email address of the user to retrieve
     * @return an Optional containing the UserModel if found, or empty if not found
     * @throws Exception if an error occurs during retrieval
     */
    Optional<UserModel> getUserByEmail(String email) throws Exception;
}
