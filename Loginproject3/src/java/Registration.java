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

/**
 *
 * @author dell
 */
public class Registration extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<style>");
            out.print("@import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap');");
            out.print("");
            out.print("* {");
            out.print("  margin: 0;");
            out.print("  padding: 0;");
            out.print("  box-sizing: border-box;");
            out.print("  font-family: 'Open Sans', sans-serif;");
            out.print("}");
            out.print("");
            out.print("body {");
            out.print("  display: flex;");
            out.print("  align-items: center;");
            out.print("  justify-content: center;");
            out.print("  padding: 0 10px;");
            out.print("  min-height: 100vh;");
            out.print("  background: #1BB295;");
            out.print("}");
            out.print("");
            out.print("form {");
            out.print("  padding: 25px;");
            out.print("  background: #fff;");
            out.print("  max-width: 500px;");
            out.print("  width: 100%;");
            out.print("  border-radius: 7px;");
            out.print("  box-shadow: 0 10px 15px rgba(0, 0, 0, 0.05);");
            out.print("}");
            out.print("");
            out.print("form h2 {");
            out.print("  font-size: 27px;");
            out.print("  text-align: center;");
            out.print("  margin: 0px 0 30px;");
            out.print("}");
            out.print("");
            out.print("form .form-group {");
            out.print("  margin-bottom: 15px;");
            out.print("  position: relative;");
            out.print("}");
            out.print("");
            out.print("form label {");
            out.print("  display: block;");
            out.print("  font-size: 15px;");
            out.print("  margin-bottom: 7px;");
            out.print("}");
            out.print("");
            out.print("form input,");
            out.print("form select {");
            out.print("  height: 45px;");
            out.print("  padding: 10px;");
            out.print("  width: 100%;");
            out.print("  font-size: 15px;");
            out.print("  outline: none;");
            out.print("  background: #fff;");
            out.print("  border-radius: 3px;");
            out.print("  border: 1px solid #bfbfbf;");
            out.print("}");
            out.print("");
            out.print("form input:focus,");
            out.print("form select:focus {");
            out.print("  border-color: #9a9a9a;");
            out.print("}");
            out.print("");
            out.print("form input.error,");
            out.print("form select.error {");
            out.print("  border-color: #f91919;");
            out.print("  background: #f9f0f1;");
            out.print("}");
            out.print("");
            out.print("form small {");
            out.print("  font-size: 14px;");
            out.print("  margin-top: 5px;");
            out.print("  display: block;");
            out.print("  color: #f91919;");
            out.print("}");
            out.print("");
            out.print("form .password i {");
            out.print("  position: absolute;");
            out.print("  right: 0px;");
            out.print("  height: 45px;");
            out.print("  top: 28px;");
            out.print("  font-size: 13px;");
            out.print("  line-height: 45px;");
            out.print("  width: 45px;");
            out.print("  cursor: pointer;");
            out.print("  color: #939393;");
            out.print("  text-align: center;");
            out.print("}");
            out.print("");
            out.print(".submit-btn {");
            out.print("  margin-top: 30px;");
            out.print("}");
            out.print("");
            out.print(".submit-btn input {");
            out.print("  color: white;");
            out.print("  border: none;");
            out.print("  height: auto;");
            out.print("  font-size: 16px;");
            out.print("  padding: 13px 0;");
            out.print("  border-radius: 5px;");
            out.print("  cursor: pointer;");
            out.print("  font-weight: 500;");
            out.print("  text-align: center;");
            out.print("  background: #1BB295;");
            out.print("  transition: 0.2s ease;");
            out.print("}");
            out.print("");
            out.print(".submit-btn input:hover {");
            out.print("  background: #179b81;");
            out.print("}");
            out.println("</style>");
            out.print("<!DOCTYPE html>");
out.print("<!-- Website - www.codingnepalweb.com -->");
out.print("<html lang=\"en\">");
out.print("  <head>");
out.print("    <meta charset=\"UTF-8\">");
out.print("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
out.print("    <title>Form Validation in HTML | CodingNepal</title>");
out.print("    <link rel=\"stylesheet\" href=\"style.css\">");
out.print("    <!-- Fontawesome CDN Link For Icons -->");
out.print("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\" />");
out.print("  </head>");
out.print("  <body>");
out.print("    <form action=\"thank-you.html\">");
out.print("      <h2>Form Validation</h2>");
out.print("      <div class=\"form-group fullname\">");
out.print("        <label for=\"fullname\">Full Name</label>");
out.print("        <input type=\"text\" id=\"fullname\" placeholder=\"Enter your full name\">");
out.print("      </div>");

out.print("      <div class=\"form-group fullname\">");
out.print("        <label for=\"fullname\">Father Name</label>");
out.print("        <input type=\"text\" id=\"fullname\" placeholder=\"Enter your full name\">");
out.print("      </div>");
out.print("      <div class=\"form-group email\">");
out.print("        <label for=\"email\">Email Address</label>");
out.print("        <input type=\"text\" id=\"email\" placeholder=\"Enter your email address\">");
out.print("      </div>");
out.print("      <div class=\"form-group password\">");
out.print("        <label for=\"password\">Password</label>");
out.print("        <input type=\"password\" id=\"password\" placeholder=\"Enter your password\">");
out.print("        <i id=\"pass-toggle-btn\" class=\"fa-solid fa-eye\"></i>");
out.print("      </div>");
out.print("      <div class=\"form-group date\">");
out.print("        <label for=\"date\">Birth Date</label>");
out.print("        <input type=\"date\" id=\"date\" placeholder=\"Select your date\">");
out.print("      </div>");
out.print("      <div class=\"form-group gender\">");
out.print("        <label for=\"gender\">Gender</label>");
out.print("        <select id=\"gender\">");
out.print("          <option value=\"\" selected disabled>Select your gender</option>");
out.print("          <option value=\"Male\">Male</option>");
out.print("          <option value=\"Female\">Female</option>");
out.print("          <option value=\"Other\">Other</option>");
out.print("        </select>");
out.print("      </div>");
out.print("      <div class=\"form-group submit-btn\">");
out.print("        <input type=\"submit\" value=\"Submit\">");
out.print("      </div>");
out.print("    </form>");
out.print("");
out.print("    <script src=\"script.js\"></script>");
out.print("  </body>");
out.print("</html>");
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
