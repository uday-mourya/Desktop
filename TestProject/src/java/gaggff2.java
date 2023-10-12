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

/**
 *
 * @author dell
 */
public class gaggff2 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
             out.println("<form action=''>");
                    out.println("<table align='center' cellpadding=15> ");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("Enter Your number");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='number' name='n1'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='hollow Square pattern'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Number Triangle'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Zero one Traingle'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Palindrome Triangle'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Diamond Pattern'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Butterfly'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='hollow traingle'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Rhombus'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Right Half Pyramid'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Reverse Half Pyramid'>");
                            out.println("</td>");
                        out.println("</tr>");
                    out.println("</table>");
                out.println("</form>");
                 String c = request.getParameter("n1");
                 int num = Integer.parseInt(c);
                 int res=0;
                 String req  = request.getParameter("b");
                 if(req.equals("hollow Square pattern"))
                 {
                     for (int i = 1; i <= num; i++) 
                     {
                        for (int j = 1; j <= num; j++) 
                        {
                                    // Print '*' for the first and last rows, and for the first and last columns
                                    // Otherwise, print a space
                                    if (i == 1 || i == num || j == 1 || j == num) 
                                    {
                                            out.print("<span>"+"*&nbsp;"+"</span>");
                                    }else 
                                    {
                                            out.print("&nbsp;&nbsp;&nbsp;");
                                    }
                        }
                            out.println("<br>"); // Move to the next line after each row
                     }
                }
                 else if(req.equals("Number Triangle"))
                 {
                    for (int i = 1; i <= num; i++) 
                    {
                        for (int j = 1; j <= i; j++) 
                        {
                            out.print("<span>"+"*&nbsp;"+"</span>");
                        }
                        out.println("<br>");
                    }
         
                 }
                 else if(req.equals("Zero one Traingle"))
                  {
                       for (int i = 1; i <= num; i++) {
                            for (int j = 1; j <= i; j++) {
                            // Use the remainder operator (%) to alternate between 0 and 1
                                    int value = (i + j) % 2;
                                    out.print(value + " ");
                            }
                            out.println("<br>");
                            }
                  }
                 else if(req.equals("Palindrome Triangle"))
                  {
                      int i,j;
                         for (i = 1; i <= num; i++) {
                            // inner loop to print the spaces
                                for (j = 1; j <= 2 * (num - i); j++) {
                                    out.print("&nbsp;&nbsp;");
                                }
  
                                // inner loop to print the first part
                                for (j = i; j >= 1; j--) {
                                    out.print("<span>"+j+"&nbsp;&nbsp;"+"</span>");
                                 }
  
                                 // inner loop to print the second part
                                for (j = 2; j <= i; j++) {
                                    out.print("<span>"+j+"&nbsp;&nbsp;"+"</span>");
                                }
  
                                // printing new line for each row
                                out.print("<br>");
        }
                  }
                  else if(req.equals("Diamond Pattern"))
                  {
                         for (int i = 1; i <= num; i++) {
                            // Print spaces to center-align the numbers
                            for (int j = 1; j <= num - i; j++) {
                            out.print("&nbsp;&nbsp;");
                            }

                            // Print the numbers in ascending order
                                for (int j = 1; j <= i; j++) {
                                     out.print("<span>"+j+"&nbsp;&nbsp;"+"</span>");
                                }

                                out.println("<br>");
                                        }

                        for (int i = num - 1; i >= 1; i--) {
            // Print spaces to center-align the numbers
                            for (int j = 1; j <= num - i; j++) {
                                 out.print("&nbsp;&nbsp;");
                            }

                            // Print the numbers in ascending order
                                for (int j = 1; j <= i; j++) {
                                    out.print("<span>"+j+"&nbsp;&nbsp;"+"</span>");
                                    }

                                    out.println("<br>");
        }
                  }
                 else if(req.equals("Butterfly"))
                  {
                         
                        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                out.print("<span>"+"*&nbsp;"+"</span>");
            }
            out.println("<br>");
        }

        // Generate the bottom half of the butterfly pattern
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                out.print("<span>"+"*&nbsp;"+"</span>");
            }
            out.println("<br>");
        }
                  }
                 else if(req.equals("hollow traingle"))
                  {
                         
                        
                        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                out.print("&nbsp;&nbsp;");
            }

            for (int j = 1; j <= i; j++) {
                // Print '*' for the first and last columns, and for the rows where i is the last row
                // Otherwise, print a space
                if (j == 1 || j == i || i == num) {
                    out.print("<span>"+"*&nbsp;&nbsp;"+"</span>");
                } else {
                    out.print("&nbsp;&nbsp;&nbsp;&nbsp;");
                }
            }
            out.println("<br>");
        }
                  }
                 else if(req.equals("Rhombus"))
                  {
                      for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                out.print("&nbsp;&nbsp;&nbsp;");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                out.print("<span>"+"*&nbsp;&nbsp;"+"</span>");
            }
            out.println("<br>");
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                out.print("&nbsp;&nbsp;&nbsp;");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                out.print("<span>"+"*&nbsp;&nbsp;"+"</span>");
            }
            out.println("<br>");
        }
                  }
                 else if(req.equals("Right Half Pyramid"))
                 {
                       int i,j;
                       for (i = 1; i <= num; i++) 
                       {
  
                        // inner loop to handle columns
                                for (j = 1; j <= i; j++)        
                                {
                                     out.print("<span>"+"*&nbsp;"+"</span>");
                                }
  
                                // printing new line for each row
                                out.println("<br>");
                        }
        
                }
                 else if(req.equals("Reverse Half Pyramid"))
                 {
                       int i,j;
        // outer loop to handle rows
        for (i = num; i >= 1; i--) {
  
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
               out.print("<span>"+"*&nbsp;"+"</span>");
            }
  
            // printing new line for each row
             out.println("<br>");
        }
        
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
