package com.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer StudentId;
	
	@Column(nullable = false)
	private String StudentName;
	@Column(nullable = false)
	private Integer Class;
	@Column(nullable = false)
	private Long Marks;
	@Column(nullable = false)
	private boolean result;

}
