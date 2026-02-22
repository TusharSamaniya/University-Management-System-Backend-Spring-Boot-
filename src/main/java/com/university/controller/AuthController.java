package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.dto.LoginRequestDTO;
import com.university.dto.LoginResponseDTO;
import com.university.service.AuthService;

@RestController
@RequestMapping
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDto){
		return ResponseEntity.ok(authService.login(loginRequestDto));
	}

}
