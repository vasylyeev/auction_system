package com.example.auction_system.controller;

import com.example.auction_system.model.Lot;
import com.example.auction_system.service.LotService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/lots")
public class LotController extends HttpServlet {

    private final LotService lotService = new LotService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Lot> activeLots = lotService.getActiveLots();
        request.setAttribute("activeLots", activeLots);

        request.getRequestDispatcher("lots.jsp").forward(request, response);
    }
}
