/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 *
 * @author erick
 */
@WebServlet(name = "ErickRandomServlet", urlPatterns = {"/erickrandom.html"})
public class ErickRandomServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ErickRandomServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h1>Servlet ErickRandomServlet at " + request.getContextPath() + "</h1>");
            int n1 = 1;
            int i = 1;
            try{
                n1 = Integer.parseInt(request.getParameter("n1"));
            }catch(Exception ex){
                out.println("<div style='color:red'>"
                        + "Parâmetro inválido, Ç.Ç </div>");
            }
            out.println("<form action=\"random.html\">\n" +
"                        <input type=\"number\" name=\"n1\" value=\"0\"/>\n" +
"                        <input type=\"submit\" value=\"Gerar\"/>\n" +
"                        </form>");
            
            out.println("<h2>Random</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Número</th>");
            out.println("</tr>");
            while(i<=n1){
                int n= (int) (100*Math.random());
                if(n%1==0){
                   out.println("<tr>");
                   out.println("<td>"+i+"</td>");
                   out.println("<td>"+n+"</td>");
                   out.println("</tr>");
                   i++;
                }
            }
            out.println("</table>");
            
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