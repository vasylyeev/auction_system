package com.example.auction_system.controller;

import com.example.auction_system.model.Lot;
import com.example.auction_system.model.Offer;
import com.example.auction_system.service.LotService;
import com.example.auction_system.service.OfferService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LotDetailsController", urlPatterns = {"/lot-details"})
public class LotDetailsController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long lotId = Long.parseLong(request.getParameter("lotId"));
        Lot lot = LotService.getLotById(lotId);
        List<Offer> offers = OfferService.getOffersForLot(lotId);

        request.setAttribute("lot", lot);
        request.setAttribute("offers", offers);

        // Forward to the lotDetails.jsp view
        request.getRequestDispatcher("/WEB-INF/views/lot-details.jsp").forward(request, response);
    }
}
