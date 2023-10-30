<%-- 
    Document   : Dashboard2
    Created on : Oct 29, 2023, 5:54:59 PM
    Author     : dell
--%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.logging.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="jakarta.servlet.*, jakarta.servlet.http.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://kit.fontawesome.com/your-fontawesome-kit.js" crossorigin="anonymous"></script>

        <style>
            body{
                /*                background-image:url(https://static.pexels.com/photos/371633/pexels-photo-371633.jpeg);*/
                background-repeat:no-repeat;
                background-size: 100%;
            }

            footer{

                margin-top: 20px;
                padding-top: 20px;
            }
            .bg__card__navbar{
                background-color: #000000;
            }
            .bg__card__footer{
                background-color: #000000 !important;
            }
            #add__new__list{
                top: -38px;
                right: 0px;
            }
        </style>
        
    </head>
    <body
        <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
            String sql = "select * from reginfo";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
        %>
        <form  method="post" onsubmit="return confirmDelete();">
        <header>

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                        <a class="nav-item nav-link active" href="index.html">Home</a>
                    </div>
                </div>
            </nav>

        </header>
        <!---->
        <main>
            <div class="container my-2">

                <div class="card container my-0">

                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">UserId</th>
                                <th scope="col">Name</th>
                                <th scope="col">Fname</th>
                                <th scope="col">Email </th>
                                <th scope="col">Contact</th>
                                <th scope="col">Edit </th>
                                <th scope="col">Delete</th>
                            </tr>
                        </thead>
                        <%
                            while (rs.next()) {
                        %>
                        <tbody>
                            <tr>
                                <th scope="row"><%= rs.getString("UserId") %></th>
                                <td><%= rs.getString("name") %></td>
                                <td><%= rs.getString("fname") %></td>
                                <td><%= rs.getString("email") %></td>
                                <td><%= rs.getString("contact") %></td>
                                <td>
                                    <a class="btn btn-sm btn-primary" href='Editor.jsp?UserId=<%= rs.getString("UserId") %>'><i class="far fa-edit"></i> edit</a>

                                </td>
                                <td>
                                    <a class="btn btn-sm btn-danger"  href='Delete.jsp?UserId=<%= rs.getString("UserId") %>'><i class="fas fa-trash-alt"></i> delete</a>  

                                </td>

                            </tr>
                            <%
                               }
                                con.close();
                            %>
                        </tbody>
                 
                    </table>
                </div>

            </div>
        </main>
        </form>
                         <%
        } catch (ClassNotFoundException ex) {
            Logger.getLogger("ViewStudent").log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("Failed to retrieve data");
            Logger.getLogger("ViewStudent").log(Level.SEVERE, null, ex);
        }
    %>
    </body>
</html>
