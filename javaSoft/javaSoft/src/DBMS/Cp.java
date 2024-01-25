/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBMS;
import java.sql.*;
/**
 *
 * @author T460
 */
public class Cp {
    
    static Connection con; 
    static String url="jdbc:mysql://localhost:3306/student_manage?useSSL=false";
    static String user="root";
    static String password="Aman@8271"; 
    public static Connection createC() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,user,password);
        
        return con;
    } 
}
