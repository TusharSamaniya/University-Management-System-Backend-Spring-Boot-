package com.university.service;

import com.university.entity.Staff;

public interface IStaffService {
	
	public Staff registerIndividualStaff(Staff staff);
	public String registerAllStaff(Iterable<Staff> staff);
	public Iterable<Staff> getStaff();

}
