package com.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.university.entity.Staff;

public interface IStaffRepository extends CrudRepository<Staff, Integer> {

}
