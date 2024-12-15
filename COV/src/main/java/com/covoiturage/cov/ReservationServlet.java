package com.covoiturage.cov;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rideId = request.getParameter("rideId");
        String userId = request.getParameter("userId");

        // For demonstration, we simply print the reservation details
        // You would save the reservation data to the database here
        System.out.println("Reservation Created: Ride ID " + rideId + " for User ID " + userId);

        // Redirect to a confirmation page
        response.sendRedirect("reservation-confirmation.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Just an example to show a form to book a reservation
        response.getWriter().write("<html><body><form action='/reservation' method='POST'>" +
                "Ride ID: <input type='text' name='rideId'><br>" +
                "User ID: <input type='text' name='userId'><br>" +
                "<input type='submit' value='Book Reservation'></form></body></html>");
    }
}
