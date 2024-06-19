/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.umflint;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class RedirectUtility {
    
    public void PerformAction(String message, String TargetURL, HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        request.setAttribute("message", message);
        
        ServletContext myLocation = request.getServletContext();
        RequestDispatcher myVehicle = myLocation.getRequestDispatcher(TargetURL);
        myVehicle.forward(request, response);
       
    }
    
    public void PerformAction(String message, String sname,String platforms, String TargetURL, HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        request.setAttribute("message", message);
        request.setAttribute("sname", sname);
        request.setAttribute("platforms", platforms);
        
        
        
        ServletContext myLocation = request.getServletContext();
        RequestDispatcher myVehicle = myLocation.getRequestDispatcher(TargetURL);
        myVehicle.forward(request, response);
       
    }
}
