package com.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "student")
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer StudentId;
	
	@Column(nullable = false)
	private String StudentName;
	@Column(nullable = false)
	private Integer StudentClass;
	@Column(nullable = false)
	private Long StudentMarks;
	@Column(nullable = false)
	private boolean result;

}
