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

public class Dashoard2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // HTML and CSS
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Dashboard</title>");
            out.println("<style>");
            out.println("* {");
            out.println("    margin: 0;");
            out.println("    padding: 0;");
            out.println("}");
            out.println("#container {");
            out.println("    height: 620px;");
            out.println("    width: 100%;");
            out.println("    margin: auto;");
            out.println("    background: linear-gradient(120deg, #007bff, #d0314c);");
            out.println("}");
            out.println("#header {");
            out.println("    height: 60px;");
            out.println("    width: 100%;");
            out.println("    background-color: white;");
            out.println("}");
            out.println("h1 {");
            out.println("    padding-top: 10px;");
            out.println("}");
            out.println("#nav {");
            out.println("    height: 50px;");
            out.println("    width: 100%;");
            out.println("    background-color: black;");
            out.println("    padding-top: 30px;");
            out.println("}");
            out.println("#nav ul li {");
            out.println("    list-style: none;");
            out.println("    display: inline;");
            out.println("    font-size: 20px;");
            out.println("}");
            out.println("#nav ul li a {");
            out.println("    text-decoration: none;");
            out.println("    color: white;");
            out.println("    margin-left: 110px;"); // Adjusted margin
            out.println("    text-align: center;");
            out.println("}");
            out.println("#nav ul li a:hover {");
            out.println("    color: #00FF00;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='container'>");
            out.println("<div id='header'>");

            // Disable caching
            response.setHeader("Cache-Control", "no-cache, no-store");

            HttpSession session = request.getSession();
            ResultSet rs = (ResultSet) session.getAttribute("rs");

            if (rs != null) {
                try {
                    String name = rs.getString("Name");
                    String email = (String) session.getAttribute("Email");

                    out.println("<center><h1>WELCOME " + name + "</h1></center>");
//                    out.println("<p>Email: " + email + "</p>");
                } catch (SQLException ex) {
                    Logger.getLogger(Dashoard2.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                response.sendRedirect("Login4");
            }

            out.println("</div>");
            out.println("<div id='nav'>");
            out.println("<ul>");
            out.println("<li><a href='Dashoard2'>Home</a></li>");
            out.println("<li><a href='Dashoard2'>About Us</a></li>");
            out.println("<li><a href='Dashoard2'>Gallery</a></li>");
            out.println("<li><a href='Profile5'>Profile</a></li>");
            out.println("<li><a href='Updatepass'>Update Password</a></li>"); // Corrected link text
            out.println("<li><a href='Logout'>Logout</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Dashboard Servlet";
    }
}
