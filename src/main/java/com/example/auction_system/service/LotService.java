package com.example.auction_system.service;

import com.example.auction_system.model.Lot;
import com.example.auction_system.model.Offer;
import com.example.auction_system.model.User;
import jakarta.persistence.*;

import java.util.List;

public class LotService {

    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("default");

    public static List<Lot> getActiveLots() {
        EntityManager em = EMF.createEntityManager();
        try {
            TypedQuery<Lot> query = em.createQuery("SELECT l FROM Lot l WHERE l.active = true", Lot.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public static Lot getLotById(Long lotId) {
        EntityManager em = EMF.createEntityManager();
        try {
            return em.find(Lot.class, lotId);
        } finally {
            em.close();
        }
    }

    public static void addOfferToLot(Lot lot, Offer offer) {
        EntityManager em = EMF.createEntityManager();
        try {
            em.getTransaction().begin();
            lot.getOffers().add(offer);
            offer.setLot(lot);
            em.persist(offer);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public static void createLot(String name, double startingPrice, User owner) {
        EntityManager em = EMF.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            Lot newLot = new Lot(name, startingPrice, owner);
            em.persist(newLot);

            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}