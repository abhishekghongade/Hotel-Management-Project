package com.hms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.entity.Manager;

@Repository
public class ManagerDao {

	@Autowired
	private SessionFactory sf;

	public List<Manager> getallManagerDetails() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		List<Manager> list = criteria.list();
		return list;

	}

	public String insertManagerDetails(Manager manager) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(manager);
		tr.commit();
		return "Data inserted..";
	}

	public String updateManagerDetails(Manager manager) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(manager);
		tr.commit();
		return "Data Updated..";
	}

	public String deleteManagerDetails(int id) {
	
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		Manager m = session.get(Manager.class,id );
		session.delete(m);
		tr.commit();
		return "Data Deleted..";
	}

}
