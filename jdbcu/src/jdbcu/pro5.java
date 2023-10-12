/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcu;

/**
 *
 * @author Dell
 */
import java.sql.*;
import java.util.Scanner;

public class pro5 {
 
    public static void main(String[] args) throws ClassNotFoundException, SQLException ,Exception
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connection");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","root","root");
            String str="Select * From Record Where  Name Like ?";
            PreparedStatement ps = con.prepareStatement(str);
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter Name");
            String name=sc.next();
            ps.setString(1,"%"+name);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println("\t"+rs.getString(2));
            }
        }
}
    
 
  

