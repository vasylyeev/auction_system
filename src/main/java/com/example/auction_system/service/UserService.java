package com.example.auction_system.service;

import com.example.auction_system.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class UserService {

    private static final String PERSISTENCE_UNIT_NAME = "yourPersistenceUnitName";
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static User getUserById(Long userId) {
        EntityManager em = EMF.createEntityManager();
        try {
            return em.find(User.class, userId);
        } finally {
            em.close();
        }
    }

    public static List<User> getAllUsers() {
        EntityManager em = EMF.createEntityManager();
        try {
            return em.createQuery("SELECT u FROM User u", User.class).getResultList();
        } finally {
            em.close();
        }
    }

}
