package com.covoiturage.cov;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/review")
public class ReviewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rideId = request.getParameter("rideId");
        String rating = request.getParameter("rating");
        String review = request.getParameter("review");

        // For demonstration, we simply print the review details
        // You would save the review data to the database here
        System.out.println("Review Submitted: Ride ID " + rideId + " Rating: " + rating + " Review: " + review);

        // Redirect to a success page or list of reviews
        response.sendRedirect("review-list.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Just an example to show a form to submit a review
        response.getWriter().write("<html><body><form action='/review' method='POST'>" +
                "Ride ID: <input type='text' name='rideId'><br>" +
                "Rating: <input type='text' name='rating'><br>" +
                "Review: <textarea name='review'></textarea><br>" +
                "<input type='submit' value='Submit Review'></form></body></html>");
    }
}
