package com.booking_management.application.services;

import com.booking_management.application.usecases.ISaveUser;
import com.booking_management.domain.models.UserModel;

public class SaveUserImpl implements ISaveUser {

    /**
     * Saves a user to the repository.
     *
     * @param userModel the user model to save
     * @return the saved user model
     */
    @Override
    public UserModel save(UserModel userModel) {
        return null;
    }
}
