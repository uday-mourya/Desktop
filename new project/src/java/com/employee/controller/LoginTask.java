/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.employee.controller;

import com.employee.model.EmployeeDAO;
import com.employee.model.EmployeeDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T460
 */
public class LoginTask extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("uaodiakd;aasdpljopwd");
            /* TODO output your page here. You may use following sample code. */
            String email= request.getParameter("email");
            
            String password=request.getParameter("password");
            EmployeeDAO edao=new EmployeeDAO();
            edao.setEmail(email);
            edao.setPassword(password);
            EmployeeDTO edto=new EmployeeDTO();
          
          boolean b =  edto.emplogin(edao);
          out.println("hfjhdjhfjh");
          if(b){
                   HttpSession session=request.getSession();
                  session.setAttribute("edao",edao);
                response.sendRedirect("EmplDashboard.jsp");
          }
          else{
              out.print("fail");
//              response.sendRedirect("index.jsp");
          }
              
//            boolean b=edto.emplogin1(edao);
//            out.print("dhdhdhh");
//            if(b){
//                HttpSession session=request.getSession();
//                session.setAttribute("edao",edao);
//                response.sendRedirect("EmplDashboard.jsp");
//            }
//            else{
//                out.print("uday");
////               response.sendRedirect("index.jsp");
//            }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
           
        }
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
