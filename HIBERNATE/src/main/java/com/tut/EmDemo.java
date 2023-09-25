package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student student = new Student();
		student.setId(12);
		student.setCity("Nagar");
		student.setName("Henry");
		
		Certificate certi = new Certificate();
		certi.setCourse("Maths");
		certi.setDuration(2);
		
		student.setCerti(certi);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	

}
