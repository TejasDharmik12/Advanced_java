package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEid(1);
		e1.setEname("Tejas");
		
		e2.setEid(2);
		e2.setEname("Yash");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(44);
		p1.setPname("Java");
		
		p2.setPid(77);
		p2.setPname("Python");
		
		List<Employee> employees = new ArrayList<Employee>();
		List<Project> projects = new ArrayList<Project>();
		
		employees.add(e1);
		employees.add(e2);
		
		projects.add(p1);
		projects.add(p1);
		
		e1.setProjects(projects);
		p2.setEmployees(employees);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		tx.commit();
		session.close();
	}

}
