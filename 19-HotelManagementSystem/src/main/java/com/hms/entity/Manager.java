package com.hms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {

	private int managerId;
	private String managerName;
	private String managersalary;
	private String managerDept;

	@Id
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagersalary() {
		return managersalary;
	}

	public void setManagersalary(String managersalary) {
		this.managersalary = managersalary;
	}

	public String getManagerDept() {
		return managerDept;
	}

	public void setManagerDept(String managerDept) {
		this.managerDept = managerDept;
	}

}
