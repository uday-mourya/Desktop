

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class profilesohan extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            response.setHeader("Cache-Control", "No-Cache");
            response.setHeader("Cache-Control", "No-Store");
            ResultSet rs = (ResultSet) session.getAttribute("rs");
            Object x;
            if (rs != null) {
                out.print("<!DOCTYPE html>");
                out.print(" <html lang='en'>");
                out.print(" <head>");
                out.print("<meta charset='UTF-8' />");
                out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
                out.print("<title>Profile Page</title>");
                out.print("<style>");
                out.print("  * {");
                out.print("    margin: 0;");
                out.print("  }");
                out.print("  body {");
                out.print("    background-color: #e8f5ff;");
                out.print("    font-family: Arial;");
                out.print("    overflow: hidden;");
                out.print("  }");
                out.print("  .navbar-top {");
                out.print("    background-color: #fff;");
                out.print("    color: #333;");
                out.print("    box-shadow: 0px 4px 8px 0px grey;");
                out.print("    height: 70px;");
                out.print("  }");
                out.print("  .title {");
                out.print("    font-family: 'Dancing Script', cursive;");
                out.print("    padding-top: 15px;");
                out.print("    position: absolute;");
                out.print("    left: 45%;");
                out.print("  }");
                out.print("  .navbar-top ul {");
                out.print("    float: right;");
                out.print("    list-style-type: none;");
                out.print("    padding: 18px 50px 0 40px;");
                out.print("  }");
                out.print("  .navbar-top ul li {");
                out.print("    float: left;");
                out.print("  }");
                out.print("  .navbar-top ul li a {");
                out.print("    color: #333;");
                out.print("    padding: 14px 16px;");
                out.print("  }");
                out.print("  .icon-count {");
                out.print("background-color: #ff0000;");
                out.print("color: #fff;");
                out.print("float: right;");
                out.print("font-size: 11px;");
                out.print("left: -25px;");
                out.print("padding: 2px;");
                out.print("position: relative;");
                out.print("  }");
                out.print("  .sidenav {");
                out.print("background-color: #fff;");
                out.print("color: #333;");
                out.print("height: 86%;");
                out.print("padding-top: 20px;");
                out.print("position: absolute;");
                out.print("top: 70px;");
                out.print("width: 250px;");
                out.print("  }");
                out.print("  .profile {");
                out.print("    text-align: center;");
                out.print("  }");
                out.print("  .profile img {");
                out.print("    border-radius: 50%;");
                out.print("    box-shadow: 0px 0px 5px 1px grey;");
                out.print("  }");
                out.print("  .name {");
                out.print("    font-size: 20px;");
                out.print("    font-weight: bold;");
                out.print("    padding-top: 20px;");
                out.print("  }");
                out.print("  .job {");
                out.print("    font-weight: bold;");
                out.print("    padding-top: 10px;");
                out.print("  }");
                out.print("  .url,");
                out.print("  hr {");
                out.print("    text-align: center;");
                out.print("  }");
                out.print("  .url hr {");
                out.print("    margin-left: 20%;");
                out.print("    width: 60%;");
                out.print("  }");
                out.print("  .url a {");
                out.print("  color: #818181;");
                out.print("  display: block;");
                out.print("  font-size: 20px;");
                out.print("  margin: 10px 0;");
                out.print("  padding: 6px 8px;");
                out.print("  text-decoration: none;");
                out.print("}");
                out.print(".url a:hover,");
                out.print(".url .active {");
                out.print("  background-color: #e8f5ff;");
                out.print("  border-radius: 28px;");
                out.print("  color: #000;");
                out.print("  margin-left: 14%;");
                out.print("  width: 65%;");
                out.print("}");
                out.print(".main {");
                out.print("margin-top: 2%;");
                out.print("margin-left: 29%;");
                out.print("font-size: 28px;");
                out.print("padding: 0 10px;");
                out.print("width: 58%;");
                out.print("}");
                out.print(".main h2 {");
                out.print("    color: #333;");
                out.print("    font-size: 24px;");
                out.print("    margin-bottom: 10px;");
                out.print("  }");
                out.print("  .main .card {");
                out.print("    background-color: #fff;");
                out.print("    border-radius: 18px;");
                out.print("    box-shadow: 1px 1px 8px 0 grey;");
                out.print("    margin-bottom: 20px;");
                out.print("    padding: 20px 0 20px 50px;");
                out.print("  }");
                out.print("  .main .card table {");
                out.print("    border: none;");
                out.print("    font-size: 16px;");
                out.print("    height: 270px;");
                out.print("    width: 80%;");
                out.print("  }");
                out.print("  .social-media {");
                out.print("    text-align: center;");
                out.print("    width: 90%;");
                out.print("  }");
                out.print("  .social-media span {");
                out.print("    margin: 0 10px;");
                out.print("  }");
                out.print("  .fa-facebook:hover {");
                out.print("    color: #4267b3 !important;");
                out.print("  }");
                out.print("  .fa-twitter:hover {");
                out.print("    color: #1da1f2 !important;");
                out.print("  }");
                out.print("  .fa-instagram:hover {");
                out.print("    color: #ce2b94 !important;");
                out.print("  }");
                out.print("  .fa-invision:hover {");
                out.print("    color: #f83263 !important;");
                out.print("  }");
                out.print("  .fa-github:hover {");
                out.print("    color: #161414 !important;");
                out.print("  }");
                out.print("  .fa-whatsapp:hover {");
                out.print("    color: #25d366 !important;");
                out.print("  }");
                out.print("  .fa-snapchat:hover {");
                out.print("    color: #fffb01 !important;");
                out.print("  }");
                out.print("</style>");
                out.print("<!-- FontAwesome 5 -->");
                out.print("<link");
                out.print("  rel='stylesheet'");
                out.print("  href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css'");
                out.print("/>");
                out.print(" </head>");
                out.print(" <body>");
                out.print("   <!-- Navbar top -->");
                out.print("   <div class='navbar-top'>");
                out.print("     <!-- <div class='title'>");
                out.print("       <h1>Profile</h1>");
                out.print("     </div> -->");
                out.print("     <!-- Navbar -->");
                out.print("     <ul>");
                out.print("       <li>");
                out.print("         <a href='#message'>");
                out.print("           <span class='icon-count'>29</span>");
                out.print("           <i class='fa fa-envelope fa-2x'></i>");
                out.print("         </a>");
                out.print("       </li>");
                out.print("       <li>");
                out.print("         <a href='#notification'>");
                out.print("           <span class='icon-count'>59</span>");
                out.print("           <i class='fa fa-bell fa-2x'></i>");
                out.print("         </a>");
                out.print("       </li>");
                out.print("       <li>");
                out.print("         <a href='LogOut'>");
                out.print("           <i class='fa fa-sign-out-alt fa-2x'></i>");
                out.print("         </a>");
                out.print("       </li>");
                out.print("     </ul>");
                out.print("     <!-- End -->");
                out.print("   </div>");
                out.print("   <!-- End -->");
                out.print("   <!-- Sidenav -->");
                out.print("   <div class='sidenav'>");
                out.print("     <div class='profile'>");
                out.print("       <img");
                out.print("         src='https://imdezcode.files.wordpress.com/2020/02/imdezcode-logo.png'");
                out.print("         alt='df'");
                out.print("         width='100'");
                out.print("         height='100'");
                out.print("       />");
                out.print("       <div class='name'>my Name</div>");
                out.print("       <div class='job'>title</div>");
                out.print("     </div>");
                out.print("     <div class='sidenav-url'>");
                out.print("       <div class='url'>");
                out.print("         <a href='Back'>Back</a>");
                out.print("         <hr align='center' />");
                out.print("       </div>");
                out.print("     </div>");
                out.print("   </div>");
                out.print("   <!-- End -->");
                out.print("   <!-- Main -->");
                out.print("   <div class='main'>");
                out.print("     <h2>IDENTITY</h2>");
                out.print("     <div class='card'>");
                out.print("       <div class='card-body'>");
                out.print("<form action='UpdateData'>");
                out.print("         <table>");
                out.print("           <tbody>");
                out.print("             <tr>");
                out.print("               <td>Name</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='text' name='name' required value=" + rs.getString(1) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td>Father</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='text' name='fname' required value=" + rs.getString(2) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td>Mobile</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='text' name='mobile' required value=" + rs.getString(4) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td>Email</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='text' name='gmail' required value=" + rs.getString(3) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td>Password</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='password' name='password' required value=" + rs.getString(5) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td>C Password</td>");
                out.print("               <td>:</td>");
                out.print("               <td><input type='password' name='cpassword' required value=" + rs.getString(5) + "></td>");
                out.print("             </tr>");
                out.print("             <tr>");
                out.print("               <td><input type='submit' value='Save'></td>");
                out.print("             </tr>");
                x = session.getAttribute("error");
                if (x.equals(1)) {
                    out.print("<td for='inputField'>Email id already Exist </td>");
                }
                if (x.equals(2)) {
                    out.print("<td for='inputField'>Password Not match </td>");
                }
                if (x.equals(3)) {
                    out.print("<td for='inputField'>Invalide Mobile number </td>");
                }
                if (x.equals(4)) {
                    out.print("<td for='inputField'>Invalide Name </td>");
                }
                if (x.equals(5)) {
                    out.print("<td for='inputField'>Invalide Father Name</td>");
                }
                out.print("           </tbody>");
                out.print("         </table>");
                out.print("</form>");
                out.print("       </div>");
                out.print("     </div>");
                out.print("     <h2>SOCIAL MEDIA</h2>");
                out.print("     <div class='card'>");
                out.print("       <div class='card-body'>");
                out.print("         <div class='social-media'>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-facebook fa-stack-1x fa-inverse'></i>");
                out.print("           </span>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-twitter fa-stack-1x fa-inverse'></i>");
                out.print("           </span>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-instagram fa-stack-1x fa-inverse'></i>");
                out.print("           </span>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-invision fa-stack-1x fa-inverse'></i>");
                out.print("           </span>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-github fa-stack-1x fa-inverse'></i>");
                out.print("           </span>");
                out.print("           <span class='fa-stack fa-sm'>");
                out.print("             <i class='fas fa-circle fa-stack-2x'></i>");
                out.print("             <i class='fab fa-whatsapp fa-stack-1x fa-inverse'></i>");
                out.print("         </div>");
                out.print("       </div>");
                out.print("     </div>");
                out.print("   </div>");
                out.print("   <!-- End -->");
                out.print(" </body>");
                out.print("</html>");
            }
//            else {
//                response.sendRedirect(request.getContextPath() + "/LoginPage");
//            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(profilesohan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(profilesohan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}