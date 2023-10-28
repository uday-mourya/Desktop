<%-- 
    Document   : Password.jsp
    Created on : 26-Oct-2023, 1:28:43 am
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="jakarta.servlet.http.HttpSession" %>
<%@page import="java.io.IOException" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Password</title>
        <style>
            #div1 {
                height: 400px;
                width: 30%;
                margin: auto;
                border: 1px solid black;
            }

            #table {
                margin-top: 70px;
            }

            input[type="password"] {
                width: 100%;
            }

            table {
                width: 100%;
            }
        </style>
        <script>
            function passValidate() {
                if (document.getElementById('pass').value == document.getElementById('cpass').value) {
                    document.getElementById('pdisplay').style.color = 'green';
                    document.getElementById('pdisplay').innerHTML = '';
                } else {
                    document.getElementById('pdisplay').style.color = 'red';
                    document.getElementById('pdisplay').innerHTML = 'not matching';
                  }
            }

        </script>

    </head>
    <body>
        <div id="div1">
            <form action="">
                <table align="center" id="table">
                    <tr>
                        <td>
                            Old Password
                            <br>
                            <input required type="password" name="oldpass">
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            New Password
                            <br>
                            <input required type="password" id="pass" name="newpass">
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Confirm Password
                            <br>
                            <input onmouseout="passValidate()" id="cpass" required type="password" name="conpass">
                            <span id="pdisplay" style="color:red;"></span>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                            <br>
                            <input required type="submit" name="btn" value="Save">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

<%  
//HttpSession session = request.getSession();
ResultSet rs = (ResultSet) session.getAttribute("rs");

if (rs != null) {
    try {
        String password = rs.getString("Password");
        String oldPassword = request.getParameter("oldpass");
        String newPassword = request.getParameter("newpass");
        String confirmPassword = request.getParameter("conpass");

        if (!password.equals(oldPassword)) {
//            out.print("The old password does not match.");
        } else if (!newPassword.equals(confirmPassword)) {
            out.print("New password and confirm password do not match.");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");

                String sql = "UPDATE reginfo SET Password = ? WHERE UserId = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, newPassword);
                ps.setString(2, rs.getString("UserId"));

                int rowsUpdated = ps.executeUpdate();
                if (rowsUpdated > 0) {
                    response.sendRedirect("Dashboard.jsp");
                } else {
                    out.print("Password update failed.");
                }
            } catch (ClassNotFoundException ex) {
                out.print("Database driver not found: " + ex.getMessage());
            } catch (SQLException ex) {
                out.print("SQL Error: " + ex.getMessage());
            }
        }
    } catch (SQLException ex) {
        out.print("Error: " + ex.getMessage());
    }
}
%>