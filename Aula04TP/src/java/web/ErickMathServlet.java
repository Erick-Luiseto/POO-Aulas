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

/**
 *
 * @author erick
 */
@WebServlet(name = "ErickMathServlet", urlPatterns = {"/erickmath.html"})
public class ErickMathServlet extends HttpServlet {

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
            out.println("<title>Servlet ErickMathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h1>Servlet ErickMathServlet at " + request.getContextPath() + "</h1>");
            double n1 = 1;
            double n2 = 1;
            String op = "Soma";
            try{
                n1 = Double.parseDouble(request.getParameter("n1"));
                n2 = Double.parseDouble(request.getParameter("n2"));
                op = request.getParameter("op");
            }catch(Exception ex){
                out.println("<div style='color:red'>"
                        + "Par??metro inv??lido, ??.?? </div>");
            }
            out.println("<form>\n" +
"                        <input type=\"number\" step=\"0.1\" name=\"n1\" value=\""+n1+"\"/>\n" +
"                        <select name='op'>\n" +
"                             <option value=\"Soma\">+</option>\n" +
"                             <option value=\"Subtra????o\">-</option>\n" +
"                             <option value=\"Multiplica????o\">*</option>\n" +
"                             <option value=\"Divis??o\">/</option>\n" +
"                         </select>\n" +
"                         <input type=\"number\" step=\"0.1\" name=\"n2\" value=\""+n2+"\"/>\n" +
"                         <input type=\"submit\" value=\"=\"/>\n" +
"                         </form>");
            out.println("<h2>Opera????o</h2>");
            if(op.equals("Soma")){
	    out.println("<h3>"+n1+" + "+n2+" = "+(n1+n2)+"</h3>");
            }
            else
                if(op.equals("Subtra????o")){
	   out.println("<h3>"+n1+" - "+n2+" = "+(n1-n2)+"</h3>");
                }
            else
	        if(op.equals("Multiplica????o")){
	   out.println("<h3>"+n1+" * "+n2+" = "+(n1*n2)+"</h3>");
                }
            else
                if(op.equals("Divis??o")){
	   out.println("<h3>"+n1+" / "+n2+" = "+(n1/n2)+"</h3>");
	        }
	    else
	        {
	   out.println("Operador Inv??lido");
	        }
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
