package com.ltts.Hibernate;

import javax.security.auth.login.Configuration;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class Karthik 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.Configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransactio();
        Employee e = new Employee();
        e.setEmpid(101);
        e.setEname("karthik");
        e.setAddress("Warangal");
        t.commit();
        session.save(e);
        factory.close();
        session.close();
    }
}
