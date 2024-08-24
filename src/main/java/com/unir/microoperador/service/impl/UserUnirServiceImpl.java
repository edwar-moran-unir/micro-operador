package com.unir.microoperador.service.impl;

import com.unir.microoperador.response.UserUnir;
import com.unir.microoperador.service.IUserUnirService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserUnirServiceImpl implements IUserUnirService {

    @Override
    public UserUnir getLogin(String username) {
        UserUnir dto = new UserUnir();
        dto.setId(Long.valueOf(10));
        dto.setToken(UUID.randomUUID().toString());
        dto.setUsername(username);
        return dto;
    }
}
