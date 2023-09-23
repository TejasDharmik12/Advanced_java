package com.spring.JDBC1.DAO;

import java.util.List;

import com.spring.JDBC1.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(int studentid);

	public Student getStudent(int studentId);
	
	public List<Student> getAllStudent();
}
