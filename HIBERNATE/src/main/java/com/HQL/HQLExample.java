package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ManyToMany.Employee;
import com.oneToMany.Answer1;
import com.tut.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
//		HQL syntax
//		String query = "from Student where city='Akola'";
		String query = "from Student where city=:x";
		
		Query q = session.createQuery(query);
//		single result unique result
//		q.uniqueResult()
//		multiple result
		q.setParameter("x", "Akola");
		
		List<Student> list = q.list();
		for(Student s:list) {
			System.out.println(s.getName());
		}
		
//		delete entries from the table
		Transaction tx = session.beginTransaction();
		String query2 = "delete from Student where id=:i";
		Query q2 = session.createQuery(query2);
		q2.setParameter("i", 7);
		int r = q2.executeUpdate();
		tx.commit();
		session.close();
		q2.executeUpdate();
		
//		update entry from the table
		Transaction tx2 = session.beginTransaction();
		String query3 = "update Student set city=:c";
		Query q3 = session.createQuery(query3);
		q3.setParameter("c", "Goa");
		int r1 = q3.executeUpdate();
		tx2.commit();
		session.close();
	}
}
