package org.example.exam2025.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.exam2025.Entity.Borrow;
import org.example.exam2025.Entity.Document;
import org.example.exam2025.Entity.User;

import java.util.List;

public class BorrowDAO {
    private EntityManager em;

    public void borrowDocument(User user, Document document) {
        Borrow borrow = new Borrow();
        borrow.setUser(user);
        borrow.setDocument(document);
        borrow.setDateBorrow(new java.util.Date());

        em.persist(borrow);
    }

    public void returnDocument(Long borrowId) {
        Borrow borrow = em.find(Borrow.class, borrowId);
        if (borrow != null) {
            borrow.setReturnDate(new java.util.Date());
            em.merge(borrow);
        }
    }

    public List<Borrow> getActiveBorrows() {
        TypedQuery<Borrow> query = em.createQuery(
                "SELECT b FROM Borrow b WHERE b.returnDate IS NULL", Borrow.class);
        return query.getResultList();
    }
}
