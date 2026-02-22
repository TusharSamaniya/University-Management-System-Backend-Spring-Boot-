package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.university.dto.LoginRequestDTO;
import com.university.dto.LoginResponseDTO;
import com.university.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	public LoginResponseDTO login(LoginRequestDTO loginRequestDto) {
		
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequestDto.getUsername(), loginRequestDto.getPassword())
		);
		
		User user = (User) authentication.getPrincipal();
		
	}

}
