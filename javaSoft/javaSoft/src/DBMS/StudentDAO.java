/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBMS;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T460
 */
public class StudentDAO {
    
    
    public static boolean insertStudentToDB(Student st){
        boolean f=false;
        try {
            Connection con=Cp.createC();
            String sql="insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,st.getStudentName());
            pst.setString(2,st.getStudentPhone());
            pst.setString(3,st.getStudentCity());
            pst.executeUpdate();
            f=true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("this exception occurs"+ex.getMessage());
           // Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        return f;
         
    }

    public static boolean deleteStudent(int userId) {
        boolean f=false;
        try {
            Connection con=Cp.createC();
            String sql="delete from students where sid=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,userId);
            
            pst.executeUpdate();
            f=true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("this exception occurs"+ex.getMessage());
           // Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        return f;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void showALLStudents() {
        boolean f=false;
        try{
            Connection con=Cp.createC();
            String sql="select * from students";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
              int id=rs.getInt(1);
              String name=rs.getString(2);
              String phone=rs.getString(3);
              String city =rs.getString(4);
                
                System.out.println("Id : "+id);
                System.out.println("name : "+name);
                System.out.println("phone : "+phone);
                System.out.println("City: "+city);
                System.out.println("-----------------------");
              
              
            }
            
        }catch(ClassNotFoundException | SQLException e){
        
        }
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean updateStudent(Student st) {
        boolean f=false;
        try{
            Connection con=Cp.createC();
            String sql=" update students set sname=?,sphone=?,scity=? where sid=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,st.getStudentName());
            pst.setString(2,st.getStudentPhone());
            pst.setString(3, st.getStudentCity());
            pst.setInt(4, st.getStid());
            pst.executeUpdate();
            f=true;
              
            
        }catch(ClassNotFoundException | SQLException e){
        
        }
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return f;
    }
    
}
