package com.example.auction_system.controller;

import com.example.auction_system.model.Lot;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet("/lots")
public class LotController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //List<Lot> activeLots = LotService.getActiveLots();
        List<Lot> activeLots = Collections.emptyList();
        request.setAttribute("activeLots", activeLots);

        request.getRequestDispatcher("lots.jsp").forward(request, response);
    }
}
