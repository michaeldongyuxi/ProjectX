/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import Classes.Constants;
import Classes.DBCmd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Michael
 */
@WebServlet(name = "Confirmation", urlPatterns = {"/Confirmation"})
public class ServletOne extends HttpServlet {
    
    String name;
    String email;
    String people;
    DBCmd cmd = new DBCmd();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        
        String url;
        String action = request.getParameter("messageType");
        
        ServletContext sc = getServletContext();
        
        System.out.println("action is: "+action);
        
        if(action.equals("submitInfo"))
        {
            
            name = request.getParameter("name");
            email = request.getParameter("email");
            people = request.getParameter("people");
            
            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("people", people);
            
            url = "/Confirmation.jsp";
            sc.getRequestDispatcher(url).forward(request, response);
        }
        
        else if(action.equals("confirm"))
        {
            url = "/ThankYou.jsp";
            request.setAttribute("name", name);
            System.out.println("print name is: " + name);
            sc.getRequestDispatcher(url).forward(request, response);
        }
        
        else if(action.equals("login"))
        {
            String Email = request.getParameter("Email");
            String password = request.getParameter("password");
            url="";
            int[] checkLogin = cmd.validUser(Email, password);
            if(checkLogin[0]==1){
                int Type = checkLogin[1];
                switch(Type){
                    case Constants.ADMIN: 
                        url="/AdminWelcome.jsp";
                        break;
                    case Constants.RESTURANT:
                        url="/RestaurantWelcome.jsp";
                        break;
                    case Constants.CUSTOMER:
                        url="/CustomerWelcome.jsp";
                        break;
                }
                sc.getRequestDispatcher(url).forward(request, response);
            }
            else 
            {
                url = "/Login.jsp";
                sc.getRequestDispatcher(url).forward(request, response);
            }
        }
        else if(action.equals("nextCust"))
        {
            url = "/welcome.jsp";
            request.setAttribute("totalCust", 100);
            sc.getRequestDispatcher(url).forward(request, response);
        }
        
        else if(action.equals("addCust"))
        {
            url = "/ThanksForSignUp.jsp";
          
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
            cmd.addUser(1, lastName, firstName, email, password, 3);
            
            request.setAttribute("totalCust", 100);
            
            sc.getRequestDispatcher(url).forward(request, response);
        }
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
