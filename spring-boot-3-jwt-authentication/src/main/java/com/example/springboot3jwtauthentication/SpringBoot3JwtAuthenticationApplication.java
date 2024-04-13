package com.example.springboot3jwtauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class SpringBoot3JwtAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3JwtAuthenticationApplication.class, args);
	}


}
