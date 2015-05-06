/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dao;

import java.util.List;
import mum.myadventure.domain.Location;
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
public class LocationDao {
    
    @Autowired
    private SessionFactory sf;

    public LocationDao() {
    }

    public LocationDao(SessionFactory sf) {
        this.sf = sf;
    }

    public List<Location> getAll() {
        Query query = sf.getCurrentSession().createQuery("from Location");
        return query.list();
    }

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    public void addLocation(Location location) {
         sf.getCurrentSession().persist(location);
    }
    
}
