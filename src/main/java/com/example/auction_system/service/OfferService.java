package com.example.auction_system.service;

import com.example.auction_system.model.Lot;
import com.example.auction_system.model.Offer;
import com.example.auction_system.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class OfferService {

    private static final String PERSISTENCE_UNIT_NAME = "yourPersistenceUnitName";
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static List<Offer> getOffersForLot(Long lotId) {
        EntityManager em = EMF.createEntityManager();
        try {
            return em.createQuery("SELECT o FROM Offer o WHERE o.lot.id = :lotId", Offer.class)
                    .setParameter("lotId", lotId)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public static void createOffer(double amount, Long lotId, Long bidderId) {
        EntityManager em = EMF.createEntityManager();
        try {
            em.getTransaction().begin();

            Offer newOffer = new Offer();
            newOffer.setAmount(amount);
            newOffer.setLot(em.find(Lot.class, lotId));
            newOffer.setBidder(em.find(User.class, bidderId));

            em.persist(newOffer);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
