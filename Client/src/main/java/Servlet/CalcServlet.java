/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Configuration.LoadXML;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proxy.Proxy;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Mejia
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

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
        Proxy proxy = new Proxy();
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");
        String method = request.getParameter("method");
        String r = null;
        Double result = null;

        Double f = Double.parseDouble(first);
        Double s = Double.parseDouble(second);

        if (method.equals("s")) {
            if (operation.equals("s")) {

                result = proxy.sumMul.sumar(f, s);
            }
            if (operation.equals("r")) {
                result = proxy.resDiv.restar(f, s);
            }
            if (operation.equals("m")) {

                result = proxy.sumMul.multiplicar(f, s);
            }
            if (operation.equals("d")) {
                result = proxy.resDiv.dividir(f, s);
            }

        }
        if (method.equals("r")) {
            //cargo el  xml para mirar la url de los servidores
            LoadXML loadXML = new LoadXML();
            String mulsumServer = loadXML.getMulsumServerREST();
            String divresServer = loadXML.getDivrestServerREST();
            //fin de la carga
            Client client = Client.create();
            String apiCall;
             WebResource webResource=null;
            
       

            if (operation.equals("s") || operation.equals("m")) {
                apiCall = mulsumServer+"?first="+first+"&second="+second+"&operator="+operation;
                webResource = client.resource(apiCall);
            }
            if (operation.equals("d") || operation.equals("r")) {
                      apiCall = divresServer+"?first="+first+"&second="+second+"&operator="+operation;
                webResource = client.resource(apiCall);
            }
             r =  webResource.get(String.class);

        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            if(result!=null){
            out.println(result.toString());
            }
            else{
                out.println(r);
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
