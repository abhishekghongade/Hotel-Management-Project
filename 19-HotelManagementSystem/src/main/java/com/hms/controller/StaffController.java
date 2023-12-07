package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Staff;
import com.jbk.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	private StaffService ss;

	@GetMapping("staffdata")
	public List<Staff> getAllStaff() {

		return ss.getAllStaff();
	}
	
	public void insertStaff() {
		
	}
}
