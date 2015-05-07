/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dao;

import java.util.List;
import mum.myadventure.domain.Destination;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class DestinationDao {
    
    @Autowired
    private SessionFactory sessionFactory;

    public DestinationDao() {
    }

    public DestinationDao(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public List<Destination> getAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Destination");
        return query.list();
    }

    public void setSf(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public void addDestination(Destination destination) {
         sessionFactory.getCurrentSession().persist(destination);
    }

    public Destination getDestinationById(long id) {
         return (Destination)sessionFactory.getCurrentSession().load(Destination.class, id);
    }
    
}
