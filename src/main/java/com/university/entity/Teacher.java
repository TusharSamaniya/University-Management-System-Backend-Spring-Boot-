package com.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Teacher")
@Data
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq")
	@SequenceGenerator(name = "teacher_seq", sequenceName = "teacher_seq", allocationSize = 1)
	private Integer TeacherId;
	
	@Column(nullable = false)
	private String TeacherName;
	
	@Column(nullable = false)
	private String TeacherSubject;
	
	@Column(nullable = false)
	private String TeacherDepartmant;
	
	@Column(nullable = false)
	private Long TeacherSalary;

}
