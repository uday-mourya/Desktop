package Travel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    Connection con;

    public boolean login(String name, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgpv12", "root", "root");
            String sql = "SELECT * FROM student WHERE user = ? and pass = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return true;

            } else {

                System.out.println("User not found.");
                resultSet.close();
                ps.close();
                con.close();
                return false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean registration(String username, String password, String name, String mothername, String fathername,
            String gender, String selectedCourse, String adhar, String dob, String mobile,
            String address, String city, String state, String pincode, String country) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Load");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgpv12", "root", "root");
            String sql = "INSERT INTO registration (name, mother_name, father_name, dob, gender, mobile_number, "
                    + "adhar_number, city, pin, state, country, address, username, course) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //PreparedStatement ps=con.prepareStatement("insert into student values('piyush','piyush@gmail.com','piyush123','male','indore')");
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, mothername);
            preparedStatement.setString(3, fathername);
            preparedStatement.setString(4, dob);
            preparedStatement.setString(5, gender);
            preparedStatement.setString(6, mobile);
            preparedStatement.setString(7, adhar);
            preparedStatement.setString(8, city);
            preparedStatement.setString(9, pincode);
            preparedStatement.setString(10, state);
            preparedStatement.setString(11, country);
            preparedStatement.setString(12, address);
            preparedStatement.setString(13, username);
            preparedStatement.setString(14, selectedCourse);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("success");
                if (signup(username, password)) {
                    con.commit();
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("false");
                JOptionPane.showMessageDialog(null, "Invalid Details", "MESSAGE", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (SQLIntegrityConstraintViolationException eve) {
            JOptionPane.showMessageDialog(null, "This Username Already exist", "MESSAGE", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public boolean signup(String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Load");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgpv12", "root", "root");
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
            ps.setString(1, user);
            ps.setString(2, pass);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("success");
                con.commit();
                return true;
            } else {
                return false;
            }

        } catch (SQLIntegrityConstraintViolationException eve) {
            JOptionPane.showMessageDialog(null, "This Username Already exist", "MESSAGE", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet dashboard(String name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgpv12", "root", "root");
            String sql = "SELECT * FROM registration WHERE username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return  resultSet;
            } else {
                System.out.println("User not found.");
                ps.close();
                con.close();
                resultSet.close();
                return  resultSet;
            }

        } catch (ClassNotFoundException | SQLException ex ) {
            ex.printStackTrace();
            
        }
        catch (Exception ex ) {
            ex.printStackTrace();
            
        }
        return null;
    }

}
