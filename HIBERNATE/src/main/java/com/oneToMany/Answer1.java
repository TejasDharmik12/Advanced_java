package com.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer1 {
	@Id
	private int answer_id;
	private String answer;
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer1(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
