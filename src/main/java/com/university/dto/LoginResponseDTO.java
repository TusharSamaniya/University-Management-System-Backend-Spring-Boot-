package com.university.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
	
	String jwt;
	Long userId;

}
