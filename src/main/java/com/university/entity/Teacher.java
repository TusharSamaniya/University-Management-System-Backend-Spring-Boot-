package com.university.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Teacher")
@Data
public class Teacher {
	
	private Integer TeacherId;
	private String TeacherName;
	private String TeacherSubject;
	private String TeacherDepartmant;
	private Long TeacherSalary;

}
