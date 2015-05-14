/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dao;

import java.util.List;
import mum.myadventure.domain.Region;
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
public class RegionDao {

    @Autowired
    SessionFactory sessionFactory;

    public RegionDao() {
    }

    public RegionDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addRegion(Region region) {
        sessionFactory.getCurrentSession().persist(region);
    }

    public List<Region> getAll() {

        Query query = sessionFactory.getCurrentSession().createQuery("from Region");
        return query.list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
}
