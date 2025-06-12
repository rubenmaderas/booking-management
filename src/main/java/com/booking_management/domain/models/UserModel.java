package com.booking_management.domain.models;

import com.booking_management.domain.enums.Role;
import lombok.Data;

@Data
public class UserModel {

    private Long id;
    private String name;
    private String email;
    private Role role;
}
