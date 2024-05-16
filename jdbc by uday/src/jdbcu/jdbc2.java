/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcu;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class jdbc2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "udaysql@350");

        //String sql="select * from data"; 
        String sql = "select * from data";
        
        PreparedStatement st = con.prepareStatement("");
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) 
        {
            System.out.println("NAME=" + rs.getString(1) + "EMAIL=" + rs.getString(2) + "PASSWORD=" + rs.getString(3) + "CITY=" + rs.getString(4));
        }
        con.close();
    }

}
