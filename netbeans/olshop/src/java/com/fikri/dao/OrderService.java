package com.fikri.dao;

import com.fikri.model.Orderdet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OrderService {
    static final Logger logger=Logger.getLogger(OrderService.class.getName());
    
    @PersistenceUnit
    EntityManagerFactory emf;

    private EntityManager em;
    
    @Transactional
    public void saveOrder(Orderdet order){
        setEm(emf.createEntityManager());
        getEm().getTransaction().begin();
        getEm().persist(order);
        getEm().getTransaction().commit();
        getEm().close();
        
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
}
