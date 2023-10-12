
package Travel;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class NewServlet extends HttpServlet {

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
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        System.out.println(pass);
        Database db = new Database();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
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

            out.println("    .content {");
            out.println("        margin-top: 4vh;");
            out.println("        width: 330px;");
            out.println("        padding: 40px 30px;");
            out.println("        background:  whitesmoke;;");
            out.println("        border-radius: 10px;");
            out.println("        box-shadow: -3px -3px 7px #ffffff73,");
            out.println("            2px 2px 5px rgba(94, 104, 121, 0.288);");
            out.println("    }");

            out.println("    .content .text {");
            out.println("        font-size: 33px;");
            out.println("        font-weight: 600;");
            out.println("        margin-bottom: 35px;");
            out.println("        color: rgb(0, 0, 0);");
            out.println("    }");

            out.println("    .field {");
            out.println("        height: 50px;");
            out.println("        width: 100%;");
            out.println("        display: flex;");
            out.println("        position: relative;");
            out.println("    }");

            out.println("    .field:nth-child(2) {");
            out.println("        margin-top: 20px;");
            out.println("    }");

            out.println("    .field input {");
            out.println("        height: 100%;");
            out.println("        width: 100%;");
            out.println("        padding-left: 45px;");
            out.println("        outline: none;");
            out.println("        border: none;");
            out.println("        font-size: 18px;");
            out.println("        background: #dde1e7;");
            out.println("        color: #595959;");
            out.println("        border-radius: 25px;");
            out.println("        box-shadow: inset 2px 2px 5px #BABECC,");
            out.println("            inset -5px -5px 10px #ffffff73;");
            out.println("    }");

            out.println("    .field input:focus {");
            out.println("        box-shadow: inset 1px 1px 2px #BABECC,");
            out.println("            inset -1px -1px 2px #ffffff73;");
            out.println("    }");

            out.println("    .field span {");
            out.println("        position: absolute;");
            out.println("        color: black;");
            out.println("        width: 50px;");
            out.println("        line-height: 50px;");
            out.println("    }");

            out.println("    .field label {");
            out.println("        position: absolute;");
            out.println("        top: 50%;");
            out.println("        transform: translateY(-50%);");
            out.println("        left: 45px;");
            out.println("        pointer-events: none;");
            out.println("        color: #666666;");
            out.println("    }");

            out.println("    .field input:valid~label {");
            out.println("        opacity: 0;");
            out.println("    }");

            out.println("    .forgot-pass {");
            out.println("        text-align: left;");
            out.println("        margin: 10px 0 10px 5px;");
            out.println("    }");

            out.println("    .forgot-pass a {");
            out.println("        font-size: 16px;");
            out.println("        color: #00233a;");
            out.println("        text-decoration: none;");
            out.println("    }");

            out.println("    .forgot-pass:hover a {");
            out.println("        text-decoration: underline;");
            out.println("    }");

            out.println("    input[type=submit]{");
            out.println("        margin: 15px 0;");
            out.println("        width: 100%;");
            out.println("        height: 50px;");
            out.println("        font-size: 18px;");
            out.println("        line-height: 50px;");
            out.println("        font-weight: 600;");
            out.println("        background: #00233a;");
            out.println("        border-radius: 25px;");
            out.println("        border: none;");
            out.println("        outline: none;");
            out.println("        cursor: pointer;");
            out.println("        color: #FFF;");
            out.println("        box-shadow: 2px 2px 5px #BABECC,");
            out.println("            -5px -5px 10px #ffffff73;");
            out.println("    }");

            out.println("    input[type=submit]:focus {");
            out.println("        color: #3498db;");
            out.println("        box-shadow: inset 2px 2px 5px #BABECC,");
            out.println("            inset -5px -5px 10px #ffffff73;");
            out.println("    }");

            out.println("    .sign-up {");
            out.println("        margin: 10px 0;");
            out.println("        color: #303030;");
            out.println("        font-size: 16px;");
            out.println("    }");

            out.println("    .sign-up a {");
            out.println("        color: #00233a;");
            out.println("        text-decoration: none;");
            out.println("    }");

            out.println("    .sign-up a:hover {");
            out.println("        text-decoration: underline;");
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
            out.println("    <div class=\"content\">");
            out.println("        <div class=\"text\">");
            out.println("            Login Form");
            out.println("        </div>");
            out.println("        <form action=\"NewServlet\">");
            out.println("            <div class=\"field\">");
            out.println("                <input type=\"text\" name='name' required>");
            out.println("                <span class=\"fas fa-user\"></span>");
            out.println("                <label>Email</label>");
            out.println("            </div>");
            out.println("            <div class=\"field\">");
            out.println("                <input type=\"password\" name='pass' required>");
            out.println("                <span class=\"fas fa-lock\"></span>");
            out.println("                <label>Password</label>");
            out.println("            </div>");
            out.println("            <div class=\"forgot-pass\">");
            out.println("                <a href=\"#\">Forgot Password?</a>");
            out.println("            </div>");
            out.println("                <input type=\"submit\" value=\"Signin\">");
            out.println("            <div class=\"sign-up\">");
            out.println("                Not a member?");
            out.println("                <a href=\"Registration\">signup now</a>");
            out.println("</html>");
            if (!("null#").equals(name + "#") ) {
                if(db.login(name, pass)){
                    HttpSession session=request.getSession();
                    session.setAttribute("user", name);
                    response.sendRedirect("Dashboard");
                }
                else{
                    out.println("<h2 style='color:red;'>User Not Found</h2>");
                }
            }
            out.println("            </div>");
            out.println("        </form>");
            out.println("    </div>");
            out.println("</center>");
            out.println("</body>");

            out.println("</html>");
            

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
