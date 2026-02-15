package com.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "alumini")
@Data
public class Alumini {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AluminiId;
	
	@Column(nullable = false)
	private String AluminiName;
	
	@Column(nullable = false)
	private String Company;
	
	@Column(nullable = false)
	private String role;
	
	@Column(nullable = false)
	private String phoneNo;

}
