package com.example.auction_system.controller;

import jakarta.inject.Inject;
import com.example.auction_system.service.AuthenticationService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Inject
    private AuthenticationService authenticationService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("hello 2");
        System.out.println("authenticationService " + authenticationService);

        if (authenticationService != null && authenticationService.authenticate(email, password)) {
            // Authentication successful
            // You can redirect the user to a different page or set a session attribute to indicate login success
            response.sendRedirect("lots.jsp");
        } else {
            // Authentication failed
            // You can redirect the user back to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
    }
}