/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class prepareupdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "udaysql@350");

        // System.out.println("SUCCESS");
        String quert = "update jdbc set name='aayush' where rollno=104;
        PreparedStatement ps;
        ps = con.prepareStatement(quert);

        int i =0;
        try {

            i = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

        //System.out.println("4");
        if (i > 0) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }
    }
 }
  
