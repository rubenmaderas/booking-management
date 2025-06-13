package com.booking_management.application.usecases;

import com.booking_management.domain.models.UserModel;

public interface ISaveUser {

    /**
     * Saves a user to the repository.
     *
     * @param userModel the user model to save
     * @return the saved user model
     */
    UserModel save(UserModel userModel);
}
