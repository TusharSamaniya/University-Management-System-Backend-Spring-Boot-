package com.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "staff")
@Data
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer StaffId;
	
	@Column(nullable = false)
	private String StaffName;
	
	@Column(nullable = false)
	private String StaffRole;
	
	@Column(nullable = false)
	private Long Salary;

}
