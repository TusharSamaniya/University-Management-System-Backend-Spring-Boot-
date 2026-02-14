package com.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.university.entity.Student;

public interface IStudentRepository extends CrudRepository<Student, Integer>{

}
