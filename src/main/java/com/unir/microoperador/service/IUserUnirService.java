package com.unir.microoperador.service;

import com.unir.microoperador.request.UserRequest;
import com.unir.microoperador.response.UserUnir;

public interface IUserUnirService {

    UserUnir getLogin(UserRequest userRequest);
}
