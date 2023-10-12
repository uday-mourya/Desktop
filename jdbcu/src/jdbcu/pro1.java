/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcu;

/**
 *
 * @author dell
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
        
public class pro1 {  
    public static void main(String[] args) throws ClassNotFoundException, SQLException ,Exception
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connection");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","udaysql@350");
        String str="Select rollno,name,fname From data Where rollno=101";
        PreparedStatement ps = con.prepareStatement(str);
        ResultSet rs=ps.executeQuery();
        
            while(rs.next())
            { 
                System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            } 
            
            con.close();
   }
}    

    

 

  

   


    

