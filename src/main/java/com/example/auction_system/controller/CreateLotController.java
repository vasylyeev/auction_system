package com.example.auction_system.controller;

import com.example.auction_system.model.User;
import com.example.auction_system.service.LotService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateLotController", urlPatterns = {"/create-lot"})
public class CreateLotController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User currentUser = (User) request.getSession().getAttribute("currentUser");
        if (currentUser == null) {
            response.sendRedirect("login.jsp");
        } else {
            request.getRequestDispatcher("/WEB-INF/views/create-lot.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lotName = request.getParameter("lotName");
        double startingPrice = Double.parseDouble(request.getParameter("startingPrice"));
        User currentUser = (User) request.getSession().getAttribute("currentUser");

        LotService.createLot(lotName, startingPrice, currentUser);

        response.sendRedirect("lots");
    }
}
