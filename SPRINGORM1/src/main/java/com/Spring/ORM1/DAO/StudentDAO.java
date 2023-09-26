package com.Spring.ORM1.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM1.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDAO {
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	@Transactional
	public void delete(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId );
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	public List<Student> getAllStudents(){
		List<Student> studetnList= this.hibernateTemplate.loadAll(Student.class);
		return studetnList;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public StudentDAO(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	public StudentDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
