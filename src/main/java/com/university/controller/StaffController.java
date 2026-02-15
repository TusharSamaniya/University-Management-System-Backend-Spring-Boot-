package com.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.entity.Staff;
import com.university.service.IStaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private IStaffService staffService;
	
	@PostMapping("/registerStaff")
	public ResponseEntity<Staff> storeStaff(@RequestBody Staff staff){
		Staff staf = staffService.registerIndividualStaff(staff);
		return new ResponseEntity<>(staf, HttpStatus.OK);
	}
	
	@PostMapping("/registerAllStaff")
	public ResponseEntity<String> storeStaffInBulk(@RequestBody Iterable<Staff> staff){
		String ids = staffService.registerAllStaff(staff);
		return new ResponseEntity<>(ids, HttpStatus.OK);
	}
	
	@GetMapping("getStaff")
	public ResponseEntity<Iterable<Staff>> showStaff(){
		Iterable<Staff> staf = staffService.getStaff();
		return new ResponseEntity<>(staf, HttpStatus.OK);
	}

}
