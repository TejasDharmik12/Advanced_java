package com.spring.JDBC1.DAO;

import java.util.List;

import javax.management.Query;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC1.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		String queString = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(queString,student.getId(),student.getName(),student.getCity());
		return r;
	}
	@Override
	public int change(Student student) {
//		updating
		String quString = "update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(quString,student.getName(),student.getCity(),student.getId());
		return r;
	}
	@Override
	public int delete(int studentid) {
		String qString = "delete from student where id=?";
		int r= this.jdbcTemplate.update(qString,studentid);
		return r;
	}
	@Override
	public Student getStudent(int studentId) {
//		selecting single student data
		String query = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper ,studentId);
		return student;
	}
	@Override
	public List<Student> getAllStudent() {
//		multiple student
		String quString = "select * from student";
		List<Student> st = this.jdbcTemplate.query(quString,new RowMapperImpl());
		return st;
	}
	
}
