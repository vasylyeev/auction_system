package com.example.auction_system.service;

import com.example.auction_system.model.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@ApplicationScoped
public class AuthenticationService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public boolean authenticate(String username, String password) {
        User user = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
                .setParameter("USERNAME", username)
                .getSingleResult();
        System.out.println("hello");
        System.out.println(user.getUsername());
        if (user == null) {
            return false;
        }
        return password.equals(user.getPassword());
    }

}
