package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   
		
		Question q1 = new Question();
		q1.setQuestionId(1);
		q1.setQuestion("What is java?");
		Answer ans = new Answer();

		ans.setAnswer("prog");
		ans.setAnswer_id(6);
		q1.setAns(ans);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(ans);
		tx.commit();
		session.close();
	}

}
