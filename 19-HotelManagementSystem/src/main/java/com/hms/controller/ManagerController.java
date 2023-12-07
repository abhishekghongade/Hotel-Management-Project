package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Manager;
import com.jbk.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService ms;

	@GetMapping("alldetails")
	public List<Manager> getallManagerDetails() {
		System.out.println("In Method");
		return ms.getallManagerDetails();

	}

	@PostMapping("insertdata")
	public String insertManagerDetails(@RequestBody Manager manager) {

		return ms.insertManagerDetails(manager);
	}

	@PutMapping("updatedata")
	public String updateManagerDetails(@RequestBody Manager manager) {

		return ms.updateManagerDetails(manager);
	}

	@DeleteMapping("deletedata")
	public String deleteManagerDetails(@RequestBody int id) {

		return ms.deleteManagerDetails(id);
	}
}
