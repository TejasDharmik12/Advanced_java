package com.SQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQL {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String query = "select * from Student";
		NativeQuery nq = session.createSQLQuery(query);
		
		List<Student> ls= nq.list();
		
		for(Student s:ls) {
			System.out.println(s.getCity());
		}
	}
}
