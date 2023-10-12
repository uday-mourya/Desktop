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
import jakarta.servlet.http.HttpSession;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class UpdateTask extends HttpServlet {

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
            

              try {
    String passnew = request.getParameter("new1");
    String passnew1 = request.getParameter("new2");
    String passold = request.getParameter("old");
    HttpSession session = request.getSession();
    String email = (String) session.getAttribute("email");
    Object id=session.getAttribute("id");
    
    out.print("Id="+id);
    if (passnew.equals(passnew1)) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet", "root", "root")) {
            String sql = "SELECT Password FROM registration WHERE email = ?";
            try (PreparedStatement ps1 = con.prepareStatement(sql)) {
                ps1.setString(1, email);
                ResultSet rs1 = ps1.executeQuery();
                
                if (rs1.next()) {
                    String password = rs1.getString("Password");
                    
                    if (password.equals(passold)) {
                        String sql1 = "UPDATE registration SET Password = ? WHERE email = ?";
                        
                        try (PreparedStatement ps = con.prepareStatement(sql1)) {
                            ps.setString(1, passnew);
                            ps.setString(2, email);
                            int count = ps.executeUpdate();
                            
                            if (count > 0) {
                                response.sendRedirect("Dashboard");
                            } else {
                                response.sendRedirect("Updatepass?error=update-failed");
                            }
                        }
                    } else {
                        response.sendRedirect("Updatepass?error=incorrect-old-password");
                    }
                } else {
                    response.sendRedirect("Updatepass?error=user-not-found");
                }
            }
        }
    } else {
        response.sendRedirect("Updatepass?error=passwords-do-not-match");
    }
} catch (ClassNotFoundException | SQLException ex) {
    // Handle exceptions appropriately
    ex.printStackTrace(); // For debugging purposes; consider logging errors
}
        }
    }

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
