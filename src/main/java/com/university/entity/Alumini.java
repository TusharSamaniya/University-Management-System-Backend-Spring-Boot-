package com.university.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "alumini")
@Data
public class Alumini {
	
	private Integer AluminiId;
	private String AluminiName;
	private String Company;
	private String role;
	private String phoneNo;

}
