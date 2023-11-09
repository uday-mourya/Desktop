
package com.employee.model;

import com.employee.model.EmployeeDAO;
import com.employee.service.gconnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import java .sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author vivek
 */
public class EmployeeDTO
{
//    public boolean login(EmployeeDAO edao)
//    {
//        boolean b=false;
//        Connection con=gconnection.getconnection();
//
//       if(con!=null)
//       {
//           String sql="select * from employee where email=?,where id=? ";
//           try{
//               PreparedStatement ps=con.prepareStatement(sql);
//              
//              ps.setString(1,edao.getemail()); 
//              
//              ps.setString(2,edao.getpassword());  
//              
//              
//              if(ps.executeQuery() > 0){
//                  b=true;
//              }
//           }
//           catch(Exception e){
//               
//           }
//        return b;
//        
//    }


     public boolean insert(EmployeeDAO edao) {
        boolean b = false;
        Connection con = gconnection.getconnection();
        if (con != null) {
            String sql = "insert into employee(name,email,password,mobile)values(?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getname());
                ps.setString(2, edao.getemail());
                ps.setString(3, edao.getpassword());
                ps.setString(4, edao.getmobile());
              
                if(ps.executeUpdate() > 0) {
                    b = true;
                   
                }
            } catch(Exception e) {

            }
        }
        return b;
    }

       
   
     public boolean update(EmployeeDAO edao)
    {
      boolean b=false;
     Connection con=gconnection.getconnection();

       if(con!=null)
       {
           String sql="update  employe set name=?,salary=?,email=?,where id=? ";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
              ps.setString(4,edao.getmobile()); 
              
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }
     
     public boolean delete(EmployeeDAO edao)
   {
      boolean b=false;
    Connection con=gconnection.getconnection();

       if(con!=null)
       {
           String sql="delete from employe where id=? ";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
              ps.setString(4,edao.getmobile()); 
              
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }

     public boolean search_id(EmployeeDAO edao)
    {
      boolean b=false;
 Connection con=gconnection.getconnection();
       if(con!=null)
       {
           String sql="Select * from where id=?";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
               
              ps.setString(5,edao.getmobile()); 
              
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }     public boolean search_name(EmployeeDAO edao)
   {
      boolean b=false;
 Connection con=gconnection.getconnection();
       if(con!=null)
       {
           String sql="delete from employe where name=? ";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
              ps.setString(4,edao.getmobile()); 
             
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }
     
     public boolean search_salary(EmployeeDAO  edao)
  {
      boolean b=false;
      Connection con=gconnection.getconnection();
       if(con!=null)
       {
           String sql="delete from employe where salary=? ";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
              ps.setString(4,edao.getmobile()); 
             
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }
     
    public boolean search_email(EmployeeDAO  edao)
   {
      boolean b=false;
 Connection con=gconnection.getconnection();
       if(con!=null)
       {
           String sql="delete from employe where email=? ";
           try{
               PreparedStatement ps=con.prepareStatement(sql);
              ps.setString(1,edao.getname()); 
              ps.setString(2,edao.getemail()); 
              ps.setString(3,edao.getpassword()); 
              ps.setString(4,edao.getmobile()); 
              
              if(ps.executeUpdate() > 0){
                  b=true;
                  return b;
              }
           }
           catch(Exception e){
               
           }
       }
        return false;
    }

}