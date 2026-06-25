package org.example.ch09.jwt;

import lombok.extern.log4j.Log4j2;
import org.example.ch09.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class JwtProviderTest {

    @Autowired
    private JwtProvider provider;

    @Test
    void createToken() {

        User user = User.builder()
                .userid("a102")
                .name("김유신")
                .birth("1999-02-11")
                .age(23)
                .role("MANAGER")
                .build();

        String jwt = provider.createToken(user, 1);
        log.info(jwt);
        /*
            eyJhbGciOiJIUzI1NiJ9.
            eyJpc3MiOiJjaGhhazA1MDNAZ21haWwuY29tIiwiaWF0IjoxNzgyMzY5Njg0LCJleHAiOjE3ODI0NTYwODQsInVzZXJuYW1lIjoiYTEwMSIsInJvbGUiOiJBRE1JTiJ9.
            MusNXvsgNeOuK4Kjv0gFWJar4qg3D2_hpzSImcukK3k
        */


    }

    @Test
    void getClaims() {
    }

    @Test
    void getAuthentication() {
    }

    @Test
    void validateToken() {
    }

    @Test
    void getIssuer() {
    }

    @Test
    void getSecret() {
    }
}