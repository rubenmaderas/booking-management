package com.booking_management.infrastructure.adapters.inbound.mappers;

import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.inbound.dto.UserResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toDto(UserModel userModel);

}

