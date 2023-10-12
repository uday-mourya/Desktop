/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Travel;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author user
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String mothername = request.getParameter("mothername");
        String fathername = request.getParameter("fathername");
        String gender = request.getParameter("gender");
        String selectedCourse = request.getParameter("courses"); // Single-select, so use getParameter directly
        String adhar = request.getParameter("adhar");
        String dob = request.getParameter("dob");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String pincode = request.getParameter("pincode");
        String country = request.getParameter("country");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            Database db=new Database();
            out.println("<html lang=\"en\">");
            
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">");
            out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("    <title>Document</title>");
            out.println("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"");
            out.println("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
            out.println("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"");
            out.println("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"");
            out.println("        crossorigin=\"anonymous\"></script>");
            out.println("<style>");
            out.println("    .active {");
            out.println("        color: #20C3D4 !important;");
            out.println("        background-color: #fff;");
            out.println("        border-radius: 50rem;");
            out.println("    }");
            out.println("    form {");
            out.println("        max-width: 600px;");
            out.println("        margin: 0 auto;");
            out.println("        background-color: #fff;");
            out.println("        padding: 20px;");
            out.println("        border-radius: 8px;");
            out.println("        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
            out.println("    }");
            out.println("    label {");
            out.println("        display: block;");
            out.println("        margin-bottom: 8px;");
            out.println("        font-weight: bold;");
            out.println("    }");
            out.println("    input, select, textarea {");
            out.println("        width: 100%;");
            out.println("        padding: 10px;");
            out.println("        margin-bottom: 15px;");
            out.println("        border: 1px solid #ccc;");
            out.println("        border-radius: 4px;");
            out.println("        box-sizing: border-box;");
            out.println("    }");
            out.println("    input[type=\"submit\"] {");
            out.println("        background-color: #4caf50;");
            out.println("        color: #fff;");
            out.println("        cursor: pointer;");
            out.println("    }");
            out.println("</style>");

            out.println("</head>");

            out.println("<body>");
            out.println("    <nav style=\"background-color: #20C3D4;\" class=\"navbar navbar-expand-lg navbar-dark static-top\">");
            out.println("        <div class=\"container\" style=\"position: relative;\">");
            out.println("            <a class=\"navbar-brand\" href=\"#\">");
            out.println("                <img src=\"https://upload.wikimedia.org/wikipedia/en/c/c4/Rajiv_Gandhi_Proudyogiki_Vishwavidyalaya_logo.png\"");
            out.println("                    alt=\"...\" height=\"56\"><span style=\"display: inline-block; position: absolute;\" class=\"ms-2\">Rajiv");
            out.println("                    Gandhi Proudyogiki <br> Vishwavidyalaya</span>");
            out.println("            </a>");
            out.println("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"");
            out.println("                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"");
            out.println("                aria-label=\"Toggle navigation\">");
            out.println("                <span class=\"navbar-toggler-icon\"></span>");
            out.println("            </button>");
            out.println("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">");
            out.println("                <ul class=\"navbar-nav ms-auto\">");
            out.println("                    <li class=\"nav-item me-3\">");
            out.println("                        <a style=\"color: rgb(255, 255, 255);\" class=\"nav-link\" aria-current=\"page\" href=\"#\">Home</a>");
            out.println("                    </li>");
            out.println("                    <li class=\"nav-item me-3\">");
            out.println("                        <a style=\"color: rgb(255, 255, 255);\" class=\"nav-link active\" href=\"#\">Login</a>");
            out.println("                    </li>");
            out.println("                    <li class=\"nav-item me-3\">");
            out.println("                        <a style=\"color: rgb(255, 255, 255);\" class=\"nav-link\" href=\"#\">Admin</a>");
            out.println("                    </li>");
            out.println("                    <li class=\"nav-item dropdown me-3\">");
            out.println("                        <a class=\"nav-link dropdown-toggle\" style=\"color: rgb(255, 255, 255);\" href=\"#\"");
            out.println("                          id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">");
            out.println("                            Student");
            out.println("                        </a>");
            out.println("                        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">");
            out.println("                            <li><a class=\"dropdown-item\" href=\"#\">Login</a></li>");
            out.println("                            <li><a class=\"dropdown-item\" href=\"#\">Registration</a></li>");
            out.println("                        </ul>");
            out.println("                    </li>");
            out.println("                </ul>");
            out.println("            </div>");
            out.println("        </div>");
            out.println("    </nav>");

            out.println("    <center>");

            out.println("<form action=\"#\" >");

// Username
            out.println("<label for=\"username\">Username:</label>");
            out.println("<input type=\"text\" id=\"username\" name=\"username\" required><br>");

// Password
            out.println("<label for=\"password\">Password:</label>");
            out.println("<input type=\"password\" id=\"password\" name=\"password\" required><br>");

// Name
            out.println("<label for=\"name\">Name:</label>");
            out.println("<input type=\"text\" id=\"name\" name=\"name\" required><br>");

// Mother's Name
            out.println("<label for=\"mothername\">Mother's Name:</label>");
            out.println("<input type=\"text\" id=\"mothername\" name=\"mothername\" required><br>");

// Father's Name
            out.println("<label for=\"fathername\">Father's Name:</label>");
            out.println("<input type=\"text\" id=\"fathername\" name=\"fathername\" required><br>");

// Gender
            out.println("<label>Gender:</label>");
            out.println("<input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\"><label for=\"male\">Male</label>");
            out.println("<input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\"><label for=\"female\">Female</label><br>");

// Courses (Multiple)
            out.println("<label for=\"courses\">Courses:</label>");
            out.println("<select id=\"courses\" name=\"courses\" required>");
            out.println("<option value=\"engineering\">Engineering</option>");
            out.println("<option value=\"computer-science\">Computer Science</option>");
            out.println("<option value=\"business\">Business</option>");
            out.println("</select><br>");

// Adhar Number
            out.println("<label for=\"adhar\">Adhar Number:</label>");
            out.println("<input type=\"text\" id=\"adhar\" name=\"adhar\" required><br>");

// Date of Birth
            out.println("<label for=\"dob\">Date of Birth:</label>");
            out.println("<input type=\"date\" id=\"dob\" name=\"dob\" required><br>");

// Mobile Number
            out.println("<label for=\"mobile\">Mobile Number:</label>");
            out.println("<input type=\"text\" id=\"mobile\" name=\"mobile\" required><br>");

// Address
            out.println("<label for=\"address\">Address:</label>");
            out.println("<textarea id=\"address\" name=\"address\" required></textarea><br>");

// City
            out.println("<label for=\"city\">City:</label>");
            out.println("<input type=\"text\" id=\"city\" name=\"city\" required><br>");

// State
            out.println("<label for=\"state\">State:</label>");
            out.println("<input type=\"text\" id=\"state\" name=\"state\" required><br>");

// Pin Code
            out.println("<label for=\"pincode\">Pin Code:</label>");
            out.println("<input type=\"text\" id=\"pincode\" name=\"pincode\" required><br>");

// Country
            out.println("<label for=\"country\">Country:</label>");
            out.println("<input type=\"text\" id=\"country\" name=\"country\" required><br>");

            out.println("<input type=\"submit\" value=\"Register\">");

            out.println("</form>");

            out.println("</body>");
            out.println("</html>");

            out.println("    </div>");
            out.println("</center>");
            out.println("</body>");

            out.println("</html>");
            if (!("null#").equals(name + "#") && db.registration(username, password, name, mothername, fathername, gender, selectedCourse,
              adhar,dob, mobile, address, city, state,
              pincode, country)) {
                response.sendRedirect("Dashboard");
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
