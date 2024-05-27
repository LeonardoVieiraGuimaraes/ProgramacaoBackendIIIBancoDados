package com.cadastro.produtos.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private String secret = "your-secret";

    public String createToken(String subject) {
        return JWT.create()
                .withSubject(subject)
                .sign(Algorithm.HMAC256(secret));
    }

    public DecodedJWT verifyToken(String token) throws JWTVerificationException {
        return JWT.require(Algorithm.HMAC256(secret))
                .build()
                .verify(token);
    }
}