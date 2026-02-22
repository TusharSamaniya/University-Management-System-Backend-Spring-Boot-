package com.university.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//@Bean
	UserDetailsService userDetailService() {
		UserDetails user1 = User.withUsername("student")
				.password(passwordEncoder().encode("pass"))
				.roles("STUDENT")
				.build();
		UserDetails user2 = User.withUsername("teacher")
				.password(passwordEncoder().encode("pass"))
				.roles("TEACHER")
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);
	}

}
