package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private int duration;
	public String getCourse() {
		return course;
	}
//	public void setCourse(String course) {
//		this.course = course;
//	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Certificate(String course, int duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCourse(String course2) {
		// TODO Auto-generated method stub
		this.course = course;
	}
	
	
}
