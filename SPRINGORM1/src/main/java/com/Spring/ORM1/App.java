package com.Spring.ORM1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.ORM1.DAO.StudentDAO;
import com.Spring.ORM1.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO studentDAO = context.getBean("studentdao",StudentDAO.class);
        
        Student student = new Student(2,"Tejas","Nagpur");
        int r = studentDAO.insert(student);
        System.out.println("Done "+r);
    }
}
