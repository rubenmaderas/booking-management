package com.booking_management.infrastructure.adapters.outbound.rest.client;

import com.booking_management.domain.models.UserModel;
import com.booking_management.domain.repository.UserRepositoryPort;
import com.booking_management.infrastructure.adapters.outbound.rest.dto.JsonPlaceholderUserDto;
import com.booking_management.infrastructure.adapters.outbound.rest.mappers.JsonPlaceholderUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JsonPlaceholderClient implements UserRepositoryPort {

    private final RestTemplate restTemplate;
    private final JsonPlaceholderUserMapper mapper;

    @Override
    public Optional<UserModel> getUserById(Long id) {

        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        JsonPlaceholderUserDto user = restTemplate.getForObject(url, JsonPlaceholderUserDto.class);

        return Optional.ofNullable(user)
                .map(mapper::toUserModel);
    }

}

