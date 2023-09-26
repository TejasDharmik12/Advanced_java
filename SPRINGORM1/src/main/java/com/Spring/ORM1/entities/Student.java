package com.Spring.ORM1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@Column(name = "student_id")
	private int studentID;
	
	private String studentName;
	private String studentCity;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public Student(int studentID, String studentName, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
