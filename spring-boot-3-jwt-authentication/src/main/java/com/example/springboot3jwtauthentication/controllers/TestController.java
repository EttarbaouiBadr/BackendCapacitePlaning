package com.example.springboot3jwtauthentication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/test")
public class TestController {
  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/anon")
  public String anonEndPoint() {
      return "everyone can see this";
  }
  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/admin_only")
  public ResponseEntity<String> adminOnly() {
    return ResponseEntity.ok("admin only ");
  }
  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/ressource_only")
  public ResponseEntity<String> ressourceOnly() {
    return ResponseEntity.ok(" ressource only ");
  }
}
