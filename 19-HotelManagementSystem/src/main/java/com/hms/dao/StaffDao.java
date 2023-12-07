package com.hms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.entity.Staff;

@Repository
public class StaffDao {

	@Autowired
	private SessionFactory sf;

	public List<Staff> getAllStaff() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		List<Staff> list = criteria.list();
		return list;

	}
}
