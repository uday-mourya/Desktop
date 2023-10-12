/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Travel;

import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Dashboard extends HttpServlet {

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

            response.setContentType("text/html;charset=UTF-8");
            String name = request.getParameter("name1");
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
                out.println("   #slider img{");
                out.println("        height:80vh;width:100%;margin-top:3vh;");
                out.println("    }");
                out.println("</style>");

                out.println("</head>");

                out.println("<body>");
                out.println("    <nav style=\"background-color: #20C3D4;width:90%;float:left;\" class=\"navbar navbar-expand-lg navbar-dark static-top\">");
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
                out.println("                        <a style=\"color: rgb(255, 255, 255);\" class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>");
                out.println("                    </li>");
                out.println("                    <li class=\"nav-item me-3\">");
                out.println("                        <a style=\"color: rgb(255, 255, 255);\" class=\"nav-link \" href=\"#\">Login</a>");
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
                out.println("    <h3 style='color:white;border:1px solid gray;background-color: #20C3D4;font-size: 14px;width=10%;padding-top:24px;padding-bottom:23px;display:flex;justify-content:center;text-align:center'><center><span>welcome<br>" + name + "<span></center><h3>");
                out.println("<div id='slider'><img src='https://www.rgpv.ac.in/images/slider/new_slide1.jpg'></div>");
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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
