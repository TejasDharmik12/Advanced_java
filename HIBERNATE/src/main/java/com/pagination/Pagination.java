package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class Pagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		Query query = s.createQuery("from Student");
		query.setFirstResult(0);
		query.setMaxResults(5);
		
		List<Student> ls = query.list();
		for(Student student : ls) {
			System.out.println(student.getCity());
		}
	}
}
