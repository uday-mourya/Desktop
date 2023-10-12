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
public class gagag extends HttpServlet {

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
                                out.println("<input type='submit' name='b' value='Square'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Cube'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Check Prime'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Armstrom'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Reverse'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Table'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Factorial'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Check Palindrome'>");
                            out.println("</td>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Print Prime'>");
                            out.println("</td>");
                            out.println("<td>");
                                out.println("<input type='submit' name='b' value='Fibonacci'>");
                            out.println("</td>");
                        out.println("</tr>");
                    out.println("</table>");
                out.println("</form>");
                 String c = request.getParameter("n1");
                 int num = Integer.parseInt(c);
                 int res=0;
                 String req  = request.getParameter("b");
                 if(req.equals("Square"))
                 {
                     res  = num*num;
                     out.println("<h1>"+res+"</h1>");
                 }
                 else if(req.equals("Cube"))
                 {
                     res  = num*num*num;
                         out.println("<h1>"+res+"</h1>");
                 }
                  else if(req.equals("Check Prime"))
                  {
                        boolean flag = false;
                        for (int i = 2; i <= num / 2; ++i) 
                        {
                            // condition for nonprime number
                            if (num % i == 0) 
                            {
                                flag = true;
                                break;
                            }
                        }

                        if (!flag)
                                out.println("<h1>"+num + " is a prime number."+"</h1>");
                        else
                                out.println("<h1>"+num + " is not a prime number."+"</h1>");
                  }
                 else if(req.equals("Armstrom"))
                  {
                        int originalNumber, remainder, result = 0;
                        originalNumber = num;

                        while (originalNumber != 0)
                        {
                            remainder = originalNumber % 10;
                            result += Math.pow(remainder, 3);
                            originalNumber /= 10;
                        }
                       if(result == num)
                                out.println("<h1>"+num + " is an Armstrom number."+"</h1>");
                        else
                                out.println("<h1>"+num + " is not an Armstrom number."+"</h1>");
                  }
                 else if(req.equals("Reverse"))
                  {
                         int reversed = 0;
                            // run loop until num becomes 0
                        while(num != 0) 
                        {
                         // get last digit from num
                            int digit = num % 10;
                            reversed = reversed * 10 + digit;

                         // remove the last digit from num
                            num /= 10;
                        }
                        out.println("<h1>"+reversed+"</h1>");
                  }
                  else if(req.equals("Table"))
                  {
                         int i = 1;
                         int mul = 0;
               
                            while (i<=10)
                            {
                                mul = num*i;
                                out.println("<h1>"+num+"*"+i+"="+mul+"</h1>");
                                i++;

                            }
                  }
                 else if(req.equals("Factorial"))
                  {
                         
                        int f=1;
                        for(int i=1;i<=num;i++)
                        {
                            f=f*i;
                        }
                        out.println("<h1>"+f+"</h1>");
                  }
                 else if(req.equals("Check Palindrome"))
                  {
                         
                        
                        int rev=0;
                        int m=num;
                        do
                        {
                            int r=num%10;
                            rev =rev*10+r;
                            num=num/10;
                        }
                        while(num>0);
                        if(m==rev)
                            out.println("<h1>"+num + " is a Palindrome number."+"</h1>");
                        else
                            out.println("<h1>"+num + " is not a Palindrome number."+"</h1>");
                  }
                 else if(req.equals("Print Prime"))
                  {
                      int count;
                  
                        for (int i = 1; i <= num; i++) 
                        {
                                count = 0;
                                for (int j = 2; j <= i / 2; j++) {
                                    if (i % j == 0) {
                                        count++;
                                        break;
                                    }
                                }
                                if (count == 0) {
                                out.println("<h1>"+i+"</h1>");
                                }
                        }
                    }
                 else if(req.equals("Fibonacci"))
                 {
                        int i,p,q,d;
                        for(i=1,p=-1,q=1,d=0;i<=num;i++)
                        {
                            d =p+q;
                            out.println("<h1>"+d+"</h1>");
                            p=q;
                            q=d;
        
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
