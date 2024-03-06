package com.example.auction_system.controller;

import com.example.auction_system.model.Lot;
import com.example.auction_system.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/lots")
public class LotController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Lot> activeLots = getLots();
        request.setAttribute("activeLots", activeLots);

        request.getRequestDispatcher("lots.jsp").forward(request, response);
    }

    private List<Lot> getLots() {
        List<Lot> lots = new ArrayList<>();

        User denys = new User("vasylyeev", "password");
        User oleksandr = new User("kuzmenko", "password");

        lots.add(new Lot("Lot 1", 100, denys));
        lots.add(new Lot("Lot 2", 50, oleksandr));
        lots.add(new Lot("Lot 3", 200, denys));
        lots.add(new Lot("Lot 4", 150, oleksandr));
        lots.add(new Lot("Lot 5", 90, denys));
        lots.add(new Lot("Lot 6", 20, oleksandr));

        return lots;
    }
}
