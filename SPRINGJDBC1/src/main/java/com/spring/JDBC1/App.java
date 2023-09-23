package com.spring.JDBC1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;import com.spring.JDBC1.DAO.StudentDao;
import com.spring.JDBC1.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/JDBC1/config.xml");
        ApplicationContext context  = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        for inserting
//        Student student = new Student();
//        student.setCity("Delhi");
//        student.setId(5);
//        student.setName("Atharva");
//        int res = studentDao.insert(student);
//        System.out.println("Student added "+res);
        
//        for updating
//        Student student = new Student();
//        student.setId(2);
//        student.setCity("Pune");
//        student.setName("Dharmik");
//        int res = studentDao.change(student);
//        System.out.println("Data changes "+res);
        
//        for delete
//        int r = studentDao.delete(2);
//        System.out.println("Deleted "+r);
        
//        select single 
//         Student st = studentDao.getStudent(5);
//         System.out.println(st);
        
//        multiple select student
        List<Student> students = studentDao.getAllStudent();
        for(Student st:students) {
        	System.out.println(st);
        }
        
        
        
//        JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
////        insert query
//        String queryString = "insert into student(id,name,city) values(?,?,?)";
////        fire query
//        int result = template.update(queryString,3,"Rohit","kanpur");
//        System.out.println("number of record inserted "+result);
    }
}
