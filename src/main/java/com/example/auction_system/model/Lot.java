package com.example.auction_system.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double startingPrice;
    private boolean active;

    @ManyToOne
    private User owner;

    @OneToMany(mappedBy = "lot", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Offer> offers = new ArrayList<>();

    protected Lot() {}

    public Lot(String name, double startingPrice, User owner) {
        this.name = name;
        this.startingPrice = startingPrice;
        this.owner = owner;
        this.active = true;
    }
}

