package com.booking_management.infrastructure.adapters.outbound.rest.mappers;

import com.booking_management.domain.models.UserModel;
import com.booking_management.infrastructure.adapters.outbound.rest.dto.JsonPlaceholderUserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JsonPlaceholderUserMapper {

    UserModel toUserModel(JsonPlaceholderUserDto dto);
}

