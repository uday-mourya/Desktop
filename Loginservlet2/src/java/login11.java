/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class login11 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
           out.println("<form action=''>");
                out.println("<table align='center'cellpadding=8>");
                    out.println("<tr>");
                        out.println("<td>");
                            out.println("Enter Your UserName");
                        out.println("</td>");
                        out.println("<td>");
                            out.println("<input type='text' placeholder='Enter your username' name='name'>");
                        out.println("</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                        out.println("<td>");
                            out.println("Enter Your Password");
                        out.println("</td>");
                        out.println("<td>");
                            out.println("<input type='text' placeholder='Enter your password' name='pass'>");
                        out.println("</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                        out.println("<td>");
                             out.println("<input type='submit' value='login' name='login'>");
                        out.println("</td>");
                        out.println("<td>");
                            out.println("<a href='register.html'>New User</a>");
                        out.println("</td>");
                    out.println("</tr>");
                out.println("</table>");
           out.println("</form>");
           
           String name  = request.getParameter("name");
           String password = request.getParameter("pass");
           String bt = request.getParameter("login");
           Connection con=null;
          if(bt.equals("login")) 
          {
                    try
                    {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");
                            String sql = "select * from user where roll=?and password = ?";
                            PreparedStatement ps = con.prepareStatement(sql);
                            ps.setString(1, name);
                            ps.setString(2, password);
                            ResultSet rs = ps.executeQuery();
                            int i = rs.getRow();
                            if(rs.next())
                                
                            {
                                out.println("<h1>Login Succeed</h1>");
                                //out.println("<h1>"+i+"</h1>");
                            }
                            else
                                out.println("<h1>Login Failed</h1>");
                                //out.println("<h1>"+i+"</h1>");
                    }
                    catch(Exception e){}
                    finally
                    {
                            try {
                            con.close();
                            } catch (SQLException ex) {
                            // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
          }
       }
        }
    /*public void insert()
    {
                if(bt.equals("login")) 
                {
                    try
                    {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");
                            String sql = "insert into mindtree values(?,?,?,?)";
                            PreparedStatement ps = con.prepareStatement(sql);
                            ps.setString(1, name);
                            ps.setString(2, fname);
                            ps.setString(3, mobile);
                            ps.setString(4, pass);
                            
                            int i = ps.executeUpdate();
                            if(i>0)
                            {
                                out.println("<h1>Data insertion Succeed</h1>");
                            }
                            else
                                 out.println("<h1>Data insertion Failed</h1>");
                    }
                    catch(Exception e){}
                    finally
                    {
                            try {
                            con.close();
                            } catch (SQLException ex) {
                            // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
          }
    }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

