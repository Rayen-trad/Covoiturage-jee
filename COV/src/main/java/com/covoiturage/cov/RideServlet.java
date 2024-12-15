package com.covoiturage.cov;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ride")
public class RideServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");

        // For demonstration, we simply print the ride details
        // You would save the ride data to the database here
        System.out.println("Ride Created: " + origin + " to " + destination);

        // Redirect to a success page or list of rides
        response.sendRedirect("ride-list.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Just an example to show a form to create a ride
        response.getWriter().write("<html><body><form action='/ride' method='POST'>" +
                "Origin: <input type='text' name='origin'><br>" +
                "Destination: <input type='text' name='destination'><br>" +
                "<input type='submit' value='Create Ride'></form></body></html>");
    }
}
