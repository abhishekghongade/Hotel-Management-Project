package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hms.dao.ManagerDao;
import com.hms.entity.Manager;

@Service
@Component
public class ManagerService {

	@Autowired
	private ManagerDao md;

	public List<Manager> getallManagerDetails() {

		return md.getallManagerDetails();
	}

	public String insertManagerDetails(Manager manager) {

		return md.insertManagerDetails(manager);
	}

	public String updateManagerDetails(Manager manager) {

		return md.updateManagerDetails(manager);

	}

	public String deleteManagerDetails(int id) {

		return md.deleteManagerDetails(id);
	}

}
