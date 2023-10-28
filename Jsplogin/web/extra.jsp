<%-- 
    Document   : extra
    Created on : Oct 26, 2023, 2:33:58 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
public boolean isValidPhoneNumber(String phoneNumber) {
    // Check if the phone number contains only digits and has a specific length
          return phoneNumber.matches("\\d{10}");
     }
<%
    String name = request.getParameter("name");
    String fname = request.getParameter("fname");
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    String cpass = request.getParameter("cpass");
    String mycontact = request.getParameter("mobno");

    if (pass != null && !pass.isEmpty() && cpass != null && !cpass.isEmpty() &&
        name != null && !name.isEmpty() && fname != null && !fname.isEmpty() &&
        email != null && !email.isEmpty() && mycontact != null && !mycontact.isEmpty()) {

        // Check if the email is already in the database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
        String sql = "select Email from reginfo where Email=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            out.println("<h4><font color='green'>Email already exists</font></h4>");
        } else {
            if (!pass.equals(cpass)) {
%>
                <h2><font color="red">Password and confirm password do not match</font></h2>
                
                if (isValidPhoneNumber(mycontact)){
                if (!pass.equals(cpass)) {
                     out.println("Password and confirm password does not match");
                     
             
                }
<%
            } else {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
                    sql = "insert into reginfo(Name, Fname, Email, Password, Contact) values(?, ?, ?, ?, ?)";
                    ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                    ps.setString(1, name);
                    ps.setString(2, fname);
                    ps.setString(3, email);
                    ps.setString(4, pass);
                    ps.setString(5, mycontact);
                    int count = ps.executeUpdate();

                    if (count > 0) {
                        ResultSet generatedKeys = ps.getGeneratedKeys();
                        if (generatedKeys.next()) {
%>
                            <h4><font color="green">Registration successful</font></h4>
<%
                        }
                    } else {
%>
                        <h4><font color="red">Registration not successful</font></h4>
<%
                    }
                } catch (Exception ex) {
%>
                    <h4><font color="red">An error occurred during registration</font></h4>
<%
                }
            }
        }
    } else {
%>
        <h4><font color="red">Please fill in all the required fields</font></h4>
<%
    }
%>
