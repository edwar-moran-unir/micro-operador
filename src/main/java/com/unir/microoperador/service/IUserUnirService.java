package com.unir.microoperador.service;

import com.unir.microoperador.response.UserUnir;

public interface IUserUnirService {

    UserUnir getLogin(String username);
}
