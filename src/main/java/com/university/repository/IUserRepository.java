package com.university.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

}
