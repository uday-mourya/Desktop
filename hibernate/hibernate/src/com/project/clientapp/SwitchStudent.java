/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.clientapp;

/**
 *
 * @author dell
 */

import com.project.pojo.Studentpojo;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SwitchStudent {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        SessionFactory sf = config.buildSessionFactory();
        Session ss = sf.openSession();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
        
        System.out.println("Eneter your choice 1-5");
        
        System.out.println("1.insert");
        System.out.println("2.read");
        System.out.println("3.update");
        System.out.println("4.delete");
        System.out.println("5.exit");
        
        ch=sc.nextInt();
        switch(ch){
            case 1:  
               Transaction t = ss.beginTransaction();
              
               System.out.println("enter your rollno");
               int roll=sc.nextInt();
               sc.nextLine();
               System.out.println("enter your name");
               String name =sc.nextLine();
               System.out.println("enter your fees");
               int fee=sc.nextInt();

               Studentpojo s = new Studentpojo(roll, name, fee);
               ss.save(s);
               t.commit();
               break;
                
            case 2:     
                System.out.println("enter your rollno");
                roll=sc.nextInt();
                sc.nextLine();
                s= (Studentpojo) ss.get(Studentpojo.class, roll); 
              if(s==null){
                  System.out.println("roll no. not found");
              }else {
               System.out.println("------------------");
               System.out.println("Id    : "+s.getRno() ); 
               System.out.println("Name  : "+s.getName()); 
               System.out.println("Class : "+s.getFee() );
               System.out.println("------------------");
           
              }
                break;
        
            case 3:
                
                System.out.println("enter your rollno");
                roll=sc.nextInt();
                sc.nextLine();
                System.out.println("enter your fees");
                fee=sc.nextInt();
                
                s=(Studentpojo) ss.get(Studentpojo.class, roll);
                if(s==null){
                  System.out.println("roll no. not found");
                }else {
                t=ss.beginTransaction(); 
                s.setFee(fee); 
                ss.save(s); 
                t.commit();
                }  
                break;
             
            case 4: 
                
                 
                 System.out.println("enter your rollno");
                 roll=sc.nextInt();
                 
                 s=(Studentpojo) ss.get(Studentpojo.class, roll); 
                 if(s==null){
                     System.out.println("roll no. not found");
                 }else {
                 t=ss.beginTransaction();     
                 ss.delete(s); 
                 System.out.println("successfully deleted");
                 t.commit();  
                 }
                 break;
        
            case 5:
                 System.exit(0);
                 break;
                 
            default : 
                System.out.println("Invalid Choice");
                break;
                
        }
        
        }while(ch<6);
        if(ss!=null){
            ss.close();
        }
//        sf.close();
}
}