package org.example.exam2025.Model;

import com.google.gson.Gson;
import org.example.exam2025.DAO.BorrowDAO;
import org.example.exam2025.DAO.DocumentDAO;
import org.example.exam2025.DAO.UserDAO;
import org.example.exam2025.Entity.Borrow;
import org.example.exam2025.Entity.Document;
import org.example.exam2025.Entity.User;

import java.io.Serializable;
import java.util.List;

public class Bean implements Serializable {
    private DocumentDAO documentDAO;

    public String getAllDocumentsJson() {
        List<Document> documents = documentDAO.getAllDocuments();
        return new Gson().toJson(documents);
    }
    public String getDocumentByIdJson(Long id) {
        Document document = documentDAO.getDocumentById(id);
        return new Gson().toJson(document);
    }

    private BorrowDAO borrowDAO;

    public String getActiveBorrowsJson() {
        List<Borrow> borrows = borrowDAO.getActiveBorrows();
        return new Gson().toJson(borrows);
    }

    public void borrowDocument(User user, Document document) {
        borrowDAO.borrowDocument(user, document);
    }

    public void returnDocument(Long borrowId) {
        borrowDAO.returnDocument(borrowId);
    }
    private UserDAO userDAO;
    private User currentUser = new User(); // Stocke l'utilisateur connecté

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void registerUser(User user) {
        userDAO.registerUser(user);
    }
}
