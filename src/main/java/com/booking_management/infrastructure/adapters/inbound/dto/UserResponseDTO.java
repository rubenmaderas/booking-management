package com.booking_management.infrastructure.adapters.inbound.dto;

import com.booking_management.domain.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private Role role;
}