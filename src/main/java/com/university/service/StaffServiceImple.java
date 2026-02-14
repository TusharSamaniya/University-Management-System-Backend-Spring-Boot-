package com.university.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Staff;
import com.university.repository.IStaffRepository;

@Service
public class StaffServiceImple implements IStaffService {
	
	@Autowired
	private IStaffRepository staffRepo;

	@Override
	public Staff registerIndividualStaff(Staff staff) {
		Staff staf = staffRepo.save(staff);
		return staf;
	}

	@Override
	public String registerAllStaff(Iterable<Staff> staff) {
		Iterable<Staff> staf =staffRepo.saveAll(staff);
		ArrayList<Integer> arr = new ArrayList<>();
		staf.forEach(x -> arr.add(x.getStaffId()));
		return arr.toString();
	}

	@Override
	public Iterable<Staff> getStaff() {
		Iterable<Staff> staf = staffRepo.findAll();
		return staf;
	}

}
