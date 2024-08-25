package com.unir.microoperador.service.impl;

import com.unir.microoperador.request.UserRequest;
import com.unir.microoperador.response.UserUnir;
import com.unir.microoperador.service.IUserUnirService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserUnirServiceImpl implements IUserUnirService {

    @Override
    public UserUnir getLogin(UserRequest userRequest) {
        UserUnir dto = new UserUnir();
        dto.setId(Long.valueOf(10));
        dto.setToken(UUID.randomUUID().toString());
        dto.setUsername(userRequest.getUsername());
        return dto;
    }
}
