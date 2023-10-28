

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RegistrationPage extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            out.print("<!DOCTYPE html>");
            out.print("<html lang='en'>");
            out.print("<head>");
            out.print("<meta charset='UTF-8' />");
            out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
            out.print("   <title>Document</title>");
            out.print("   <style>");
            out.print("     * {");
            out.print("       margin: 0;");
            out.print("       padding: 0;");
            out.print("       box-sizing: border-box;");
            out.print("       font-family: 'Poppins', sans-serif;");
            out.print("     }");
            out.print("     body {");
            out.print("       min-height: 100vh;");
            out.print("       display: flex;");
            out.print("       align-items: center;");
            out.print("       justify-content: center;");
            out.print("       background: #4070f4;");
            out.print("     }");
            out.print("     .wrapper {");
            out.print("       position: relative;");
            out.print("       max-width: 430px;");
            out.print("       width: 100%;");
            out.print("       background: #fff;");
            out.print("       padding: 34px;");
            out.print("       border-radius: 6px;");
            out.print("       box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);");
            out.print("     }");
            out.print("     .wrapper h2 {");
            out.print("       position: relative;");
            out.print("       font-size: 22px;");
            out.print("       font-weight: 600;");
            out.print("       color: #333;");
            out.print("     }");
            out.print("     .wrapper form {");
            out.print("       margin-top: 30px;");
            out.print("     }");
            out.print("     .wrapper form .input-box {");
            out.print("       height: 52px;");
            out.print("       margin: 18px 0;");
            out.print("     }");
            out.print("     form .input-box input {");
            out.print("       height: 100%;");
            out.print("       width: 100%;");
            out.print("       padding: 0 15px;");
            out.print("       font-size: 17px;");
            out.print("       font-weight: 400;");
            out.print("       color: #333;");
            out.print("       border: 1.5px solid #c7bebe;");
            out.print("       border-bottom-width: 2.5px;");
            out.print("       border-radius: 6px;");
            out.print("     }");
            out.print("     form h3 {");
            out.print("       color: #707070;");
            out.print("       font-size: 14px;");
            out.print("       font-weight: 500;");
            out.print("       margin-left: 10px;");
            out.print("     }");
            out.print("     .input-box.button input {");
            out.print("       color: #fff;");
            out.print("       border: none;");
            out.print("       background: #4070f4;");
            out.print("     }");
            out.print("     .input-box.button input:hover {");
            out.print("       background: #0e4bf1;");
            out.print("     }");
            out.print("     form .text h3 {");
            out.print("       color: #333;");
            out.print("       width: 100%;");
            out.print("       text-align: center;");
            out.print("     }");
            out.print("     form .text h3 a {");
            out.print("       color: #4070f4;");
            out.print("       text-decoration: none");
            out.print("     }");
            out.print("     form .text h3 a:hover {");
            out.print("       text-decoration: underline;");
            out.print("     }");
            out.print("   </style>");
            out.print(" </head>");
            out.print(" <body>");
            out.print("   <div class='wrapper'>");
            out.print("     <h2>Registration</h2>");
            out.print("     <form action='RegistrationTask22'>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='text'");
            out.print("           placeholder='Enter your name'");
            out.print("           required");
            out.print("           name='name'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='text'");
            out.print("           placeholder='Enter your Father Name'");
            out.print("           required");
            out.print("           name='fname'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='text'");
            out.print("           placeholder='Enter your Mobile'");
            out.print("           required");
            out.print("           name='mobile'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='email'");
            out.print("           placeholder='Enter your email'");
            out.print("           required");
            out.print("           name='email'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='pass'");
            out.print("           placeholder='Create password'");
            out.print("           required");
            out.print("           name='password'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box'>");
            out.print("         <input");
            out.print("           type='password'");
            out.print("           placeholder='Confirm password'");
            out.print("           required");
            out.print("           name='cpassword'");
            out.print("         />");
            out.print("       </div>");
            out.print("       <div class='input-box button'>");
            out.print("         <input type='Submit' value='Register Now' />");
            out.print("       </div>");
            out.print("       <div class='text'>");
            out.print("         <h3>");
            out.print("           Already have an account? <a href='LoginPage'>Login now</a>");
            out.print("         </h3>");
            out.print("       </div>");

            int x = (Integer) session.getAttribute("error");
            if (x == 1) {
                out.print(" <br> <br> <label for='inputField'>Email id already Exist </label>");
            }
            if (x == 2) {
                out.print(" <br> <br> <label for='inputField'>Password Not match </label>");
            }
            if (x == 3) {
                out.print(" <br> <br> <label for='inputField'>Invalide Mobile number </label>");
            }
            if (x == 4) {
                out.print(" <br> <br> <label for='inputField'>Invalide Name </label>");
            }
            if (x == 5) {
                out.print(" <br> <br> <label for='inputField'>Invalide Father Name</label>");
            }
            out.print("     </form>");
            out.print("   </div>");
            out.print(" </body>");
            out.print("</html>");
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
        return "Short description";
    }// </editor-fold>

}