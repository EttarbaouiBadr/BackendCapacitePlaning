package com.example.springboot3jwtauthentication.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.springboot3jwtauthentication.dto.JwtAuthenticationResponse;
import com.example.springboot3jwtauthentication.dto.SignInRequest;
import com.example.springboot3jwtauthentication.dto.AddRessourceRequest;
import com.example.springboot3jwtauthentication.services.AuthenticationService;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add_ressource")
    public JwtAuthenticationResponse add_ressource(@RequestBody AddRessourceRequest request) {
        return authenticationService.add_ressource(request);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SignInRequest request) {
        return authenticationService.signin(request);
    }
}