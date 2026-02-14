package com.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.university.entity.Teacher;

public interface ITeacherRepository extends CrudRepository<Teacher, Integer> {

}
