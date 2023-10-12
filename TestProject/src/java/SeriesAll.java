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
public class SeriesAll extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CuSqFa1</title>");            
            out.println("</head>");
            out.println("<body>");
             out.println("<br><br><br>");
             out.print("<form action=''>");
             out.print("<table width='270px' height='430px' align='center' bgcolor='#F0BE16'>");
             out.print("<tr>");
             out.print("<td>");
             out.print("<font size='5px' color='white'>"+"Enter First Number :"+"</font>");
             out.print("<input  style=\"width: 250px; height: 30px;\"type='text' placeholder='Enter First Number' name='n1'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\" type='submit' name='obj' value='!1+!2+!3+!4+!5'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\"type='submit' name='obj' value='-!1+!2-!3+!4-!5'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\" type='submit' name='obj' value='!1-!2+!3-!4+!5'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\" type='submit' name='obj' value='!1/1+!2/2+!3/3+!4/4+!5/5'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\" type='submit' name='obj' value='!1/1-!2/2+!3/3-!4/4+!5/5'>");
             out.print("<input style=\"width: 200px; height: 30px; background:green; margin:10px\" type='submit' name='obj' value='!1/1+!2/2-!3/3+!4/4-!5/5'>");
             out.print("<input  style=\"width: 125px; height: 30px; background: black; color:red; margin-left:70px\"type='reset' name='obj' value='Clear'>");
             out.print("<input  style=\"width: 250px; height: 30px;\"type='text' name='n2'>");
             out.print("</td>");       
             out.print("</tr>");
             out.print("</table>");
             out.println("</body>");
            out.println("</html>");
            Integer a;
            a=Integer.parseInt(request.getParameter("n1"));
            String op=request.getParameter("obj");
            if(op.equals("!1+!2+!3+!4+!5")){
                int i;
                int sum=1;
                int s=0;
                for(i=1;i<=a;i++)
                {
                    out.print("!"+i);
		if(i<a){
		out.print(" + ");
		}
                sum=sum*i;
                s=s+sum;
                }
                out.println("="+s);
            }
            else if(op.equals("-!1+!2-!3+!4-!5")){
                int i;
                int sum=1;
                int s=0;
                for(i=1;i<=a;i++)
                {
                out.print("!"+i);
		if(i%2==0 && i<a){
		out.print(" - ");
		}else if(i<a)
		out.print(" + ");
                sum=sum*i;
                if(i%2==0)
                s=s+sum;
                else
                s=s-sum;
                }
                out.println(" = "+s);
            }
             else if(op.equals("!1-!2+!3-!4+!5")){
                int i;
                int sum=1;
                int s=0;
                for(i=1;i<=a;i++)
                {
                out.print("!"+i);
		if(i%2==0 && i<a){
		out.print(" + ");
		}else if(i<a)
		out.print(" - ");
                sum=sum*i;
                if(i%2==0)
                s=s-sum;
                else
                s=s+sum;
                }
                out.println(" = "+s);
            }
             else if(op.equals("!1/1+!2/2+!3/3+!4/4+!5/5")){
                int i;
                int sum=1;
                int s=0;
                int div=0;
                for(i=1;i<=a;i++)
                {
                    out.print("!"+i+"/"+i);
                    if(i<a){
                    out.print(" + ");
		}
                sum=sum*i;
                div=sum/i;
                s=s+div;
                }
                out.println("="+s);
            }
             else if(op.equals("!1/1-!2/2+!3/3-!4/4+!5/5")){
                int i;
                int sum=1;
                int s=0;
                int div=0;
                for(i=1;i<=a;i++)
                {
                    out.print("!"+i+"/"+i);
                    if(i%2==0 && i<a)
                    out.print(" + ");
                    else if(i<a)
                    out.print(" - ");
                    sum=sum*i;
                    div=sum/i;
                    if(i%2==0)
                    s=s-div;
                    else
                    s=s+div;
                }
                    out.println(" = "+s);
             }
            else if(op.equals("!1/1+!2/2-!3/3+!4/4-!5/5")){
                int i;
                int sum=1;
                int s=0;
                int div=0;
                for(i=1;i<=a;i++)
                {
                    out.print("!"+i+"/"+i);
                    if(i%2==0 && i<a)
                    out.print(" - ");
                    else if(i<a)
                    out.print(" + ");
                    sum=sum*i;
                    div=sum/i;
                    if(i%2==0)
                    s=s+div;
                    else
                    s=s-div;
                }
                    out.println(" = "+s);
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
