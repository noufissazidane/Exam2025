package org.example.exam2025.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.exam2025.Entity.Document;

import java.util.List;

public class DocumentDAO {
    private EntityManager em;

    public void addDocument(Document doc) {
        em.persist(doc);
    }

    public void updateDocument(Document doc) {
        em.merge(doc);
    }

    public void deleteDocument(Long id) {
        Document doc = em.find(Document.class, id);
        if (doc != null) {
            em.remove(doc);
        }
    }

    public Document getDocumentById(Long id) {
        return em.find(Document.class, id);
    }

    public List<Document> getAllDocuments() {
        TypedQuery<Document> query = em.createQuery("SELECT d FROM Document d", Document.class);
        return query.getResultList();
    }
}

