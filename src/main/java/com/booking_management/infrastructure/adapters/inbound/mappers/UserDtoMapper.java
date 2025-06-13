package com.booking_management.infrastructure.adapters.inbound.mappers;

import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.inbound.dto.UserResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserResponseDto toDto(UserModel userModel);
}

