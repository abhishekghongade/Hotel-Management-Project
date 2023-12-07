package com.jbk.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hms.dao.StaffDao;
import com.hms.entity.Staff;

@Service
@Component
public class StaffService {

	@Autowired
	private StaffDao sd;

	public List<Staff> getAllStaff() {

		return sd.getAllStaff();
	}
}
