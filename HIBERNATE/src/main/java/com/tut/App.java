package com.tut;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
//        creating student
        Student student = new Student();
        student.setId(101);
        student.setCity("Pune");
        student.setName("Tejas");
        
//        creating object of address class
        Address address = new Address();
        address.setStreet("street1");
        address.setCity("Nagpur");
        address.setAddressId(1);
        address.setX(22);
        address.setAddedDate(new Date());
        address.setOpen(true);
        
        
//        Reading image
        FileInputStream file = new FileInputStream("src/main/java/com/tut/pic.png");
        byte[] data = new byte[file.available()];
        file.read(data);
        address.setImage(data);
        
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        session.save(address);
        tx.commit();
        session.close();
        
        
    }
}
