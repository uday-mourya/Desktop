

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.project.Bl;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author dell
 */


public class BusinessLogic {
    
    public static void test()
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        
        String q="from Studentpojo";
        Query qu=session.createQuery(q);
        
        List ls=qu.list();
        
        for(Object ob:ls)
        {
            System.out.println(""+ob); 
        }
        sf.close();
    }
    public static void main(String[] args) 
    {
        BusinessLogic.test();
      
    }
        

}
