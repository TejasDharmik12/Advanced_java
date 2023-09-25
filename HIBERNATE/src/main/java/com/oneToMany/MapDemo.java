package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

//		Question1 q1 = new Question1();
//		q1.setQuestionId(1);
//		q1.setQuestion("What is java?");
//		Answer1 ans = new Answer1();
//
//		ans.setAnswer("prog");
//		ans.setAnswer_id(6);
//		Answer1 ans1 = new Answer1();
//		ans1.setAnswer("My Answer2");
//		ans1.setAnswer_id(7);
//		
//		Answer1 ans2 = new Answer1();
//		ans2.setAnswer("My answer3");
//		ans2.setAnswer_id(8);
//		
//		List<Answer1> ls = new ArrayList<>();
//		ls.add(ans);
//		ls.add(ans1);
//		ls.add(ans2);
//		q1.setAnswers(ls);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(q1);
//		session.save(ans);
//		session.save(ans1);
//		session.save(ans2);
//		
		Question1 q = (Question1) session.get(Question1.class, 1);
		System.out.println(q.getQuestion());
		for (Answer1 a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		tx.commit();
		session.close();
	}

}
