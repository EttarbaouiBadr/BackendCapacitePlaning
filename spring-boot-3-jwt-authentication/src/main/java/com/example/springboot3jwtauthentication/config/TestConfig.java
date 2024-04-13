package com.example.springboot3jwtauthentication.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class TestConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings  (CorsRegistry registry) {
        registry.addMapping("/api/v1/") // Définissez ici le chemin de votre API
                .allowedOrigins("http://localhost:4200") // Autorise les requêtes depuis ce domaine
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Autorise les méthodes HTTP spécifiées
                .allowCredentials(true); // Autorise les cookies et les informations d'authentification
        // }
}}
