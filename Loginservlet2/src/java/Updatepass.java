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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Updatepass extends HttpServlet {

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
             HttpSession session=request.getSession();  
                ResultSet rs1=(ResultSet)session.getAttribute("rs");
                 session.setAttribute("id", rs1.getString(6));
                 
                 String name=rs1.getString(1);
//                 out.print("ID="+rs1.getString(6));
            
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Dashboard</title>"); 
               out.println("<style>");
            out.println("*{");
            out.println("    margin:0;");
            out.println("    padding:0;");
            out.println("}");
            out.println("#container{");
            out.println("    height:620px;");
            out.println("    width:100%;");
            out.println("    margin:auto;");
            out.println(" background: linear-gradient(120deg, #007bff, #d0314c);");
            out.println("}");
            out.println("#header{");
            out.println("    height:60px;");
            out.println("    width:100%;");
            out.println("    background-color: white;");
            out.println("}");
            out.println("h1{");
            out.println("    padding-top:10px;");
            out.println("}");
            out.println("#nav{");
            out.println("    height:50px;");
            out.println("    width:100%;");
            out.println("    background-color:black !important;");
            out.println("    padding-top:30px;");
            out.println("}");
            out.println("#nav ul li{");
            out.println("    list-style:none;");
            out.println("    display:inline;");

            out.println("    font-size:20px;");
            out.println("}");
            out.println("#nav ul li a{");
            out.println("    text-decoration:none;");
            out.println("    color:white;");
            out.println("    margin-left:120px;");
            out.println("    margin-top:50px;");
            out.println("   text-align:center;");
            out.println("}");
            out.println("#nav ul li a:hover{");
            out.println("    color:#00FF00jjj;");
            out.println("}");

            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
           
          out.println("<center><h1>WELCOME &nbsp&nbsp&nbsp&nbsp; "+name+"</h1></center>");
            out.println("</div>");
            out.println("<div id='nav'>");
            out.println("<ul>");
            out.println("<li><a  href='Dashoard2'>Home</a></li>");
            out.println("<li><a  href='Dashoard2'>About Us</a></li>");
            out.println("<li><a  href='Dashoard2'>Gallery</a></li>");
//            out.println("<td>"+"<a href='Editor?Email="+rs.getString("Email")+"'>Edit</a>"+"</td>");
            out.println("<li><a href='Profile5'>Profile</a></li>");
             out.println("<li><a href='Updatepass'>UpdatePassword</a></li>");
            out.println("<li><span><a href='Logout'>Logout</a><span></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            
              out.println("<div id=\"content\">");
        out.println("<div id=\"change\">");
        out.println("<form action=\"UpdateTask\">");
        
//        HttpSession session=request.getSession();  
//                ResultSet rs1=(ResultSet)session.getAttribute("rs");
//                 session.setAttribute("id", rs1.getString(6));
//                 out.print("ID="+rs1.getString(6));
        out.println("<table cellspacing=\"13\">");
        out.println("<tr>");
        out.println("<td>Enter New Password :</td>");
        out.println("<td><input type=\"password\" placeholder=\"Enter New Password\" name=new1></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Confirm New Password :</td>");
        out.println("<td><input type=\"password\" placeholder=\"Confirm New Password\" name='new2'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Enter Old Password :</td>");
        out.println("<td><input type=\"password\" placeholder=\"Enter Old Password\" name='old'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td colspan=\"2\"><input type=\"submit\" value=\"Change Password\" id=\"password\"></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");

        out.println("    </div>");
            out.println("</body>");
               

        } catch (SQLException ex) {
            Logger.getLogger(Updatepass.class.getName()).log(Level.SEVERE, null, ex);
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
