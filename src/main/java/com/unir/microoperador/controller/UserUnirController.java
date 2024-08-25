package com.unir.microoperador.controller;

import com.unir.microoperador.model.Product;
import com.unir.microoperador.request.UserRequest;
import com.unir.microoperador.response.UserUnir;
import com.unir.microoperador.service.IProductService;
import com.unir.microoperador.service.IUserUnirService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Usuario")
public class UserUnirController {

    private final IUserUnirService userUnirService;

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para Login")
    @PostMapping("/login")
    public ResponseEntity<UserUnir> getLogin(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userUnirService.getLogin(userRequest));
    }
}
