package org.example.exam2025.DAO;

import jakarta.persistence.EntityManager;
import org.example.exam2025.Entity.User;

public class UserDAO {
    private EntityManager em;

    public void registerUser(User user) {
        em.persist(user);
    }
}
