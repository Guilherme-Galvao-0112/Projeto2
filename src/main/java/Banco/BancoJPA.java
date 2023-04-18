package Banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BancoJPA {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Oficina");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void inserir(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
        em.close();
    }
}

