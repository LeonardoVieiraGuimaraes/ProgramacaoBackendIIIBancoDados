package com.cadastro.produtos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.produtos.services.JwtService;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody User user) {
        // Aqui você deve verificar as credenciais do usuário (por exemplo, verificar o nome de usuário e a senha no banco de dados)
        // Se as credenciais estiverem corretas, emita um token JWT
        String token = jwtService.createToken(user.getUsername());
        return ResponseEntity.ok(token);
    }
}