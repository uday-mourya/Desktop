/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employee.service;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author dell
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class gconnection {
    
    public static Connection getconnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql//localhost:3306/ mvc_architecture" ,"root","udaysql@350");
            
        }
            catch(Exception e){
                
                    
                    }
        return con;
        
    }
    
    
}