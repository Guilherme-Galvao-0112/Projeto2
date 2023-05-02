package Banco;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BancoJPA {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BDOficina");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void inserir(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
        em.close();
    }
    
    public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit();
        em.close();
    }
    
    public void update(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
        em.close();
    }
    
    public List listar (Object o){
        Query query = em.createQuery("SELECT o FROM "+o.getClass().getSimpleName()+" o");
        return query.getResultList();
    }
}

