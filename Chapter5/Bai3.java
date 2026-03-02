package com.myapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bai3 {

    public static void main(String[] args) {

       SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Product.class)
        .buildSessionFactory();


       try (Session session = factory.openSession()) {
   
           session.beginTransaction();

    
           Product p = new Product("Laptop", 1500);
           session.persist(p);

    
           session.getTransaction().commit();
    
           System.out.println("Lưu thành công!");
} 
      
       finally {
    
    
           factory.close();

       }
    }
}