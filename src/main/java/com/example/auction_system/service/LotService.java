package com.example.auction_system.service;

import com.example.auction_system.model.Lot;
import com.example.auction_system.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class LotService {

    private static final String PERSISTENCE_UNIT_NAME = "yourPersistenceUnitName";
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static List<Lot> getActiveLots() {
        EntityManager em = EMF.createEntityManager();
        try {
            return em.createQuery("SELECT l FROM Lot l WHERE l.active = true", Lot.class).getResultList();
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

    public static void createLot(String name, double startingPrice, User owner) {
        EntityManager em = EMF.createEntityManager();
        try {
            em.getTransaction().begin();

            Lot newLot = new Lot(name, startingPrice, owner);
            em.persist(newLot);

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
