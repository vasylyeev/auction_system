package com.example.auction_system.model;

import jakarta.persistence.*;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @ManyToOne
    private Lot lot;

    @ManyToOne
    private User bidder;

    public Offer() {
    }

    public Offer(double amount, Lot lot, User bidder) {
        this.amount = amount;
        this.lot = lot;
        this.bidder = bidder;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }
}
