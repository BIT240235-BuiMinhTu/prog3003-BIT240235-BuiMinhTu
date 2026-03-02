package com.myapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Bai4 {

    public static void main(String[] args) {

SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Product.class)
        .buildSessionFactory();

try (   Session session = factory.openSession()) {
    session.beginTransaction();

    List<Product> list = session
            .createQuery("FROM Product WHERE price > 1000", Product.class)
            .getResultList();

    for (Product p : list) {
        System.out.println(p.getName() + " - " + p.getPrice());
    }

    session.getTransaction().commit();
} 

    finally {
    factory.close();

}
    }
}