package com.university.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class WebSecurityConfig {
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
		httpSecurity
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/staff/**").permitAll()
				.requestMatchers("/student/**").hasRole("STUDENT")
				.requestMatchers("/teacher/**").hasAnyRole("TEACHER", "STUDENT")
		)
		.formLogin(Customizer.withDefaults());
		return httpSecurity.build();
		
	}
	
	

}
