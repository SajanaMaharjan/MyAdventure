/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dao;

import java.util.List;
import mum.myadventure.domain.Adventure;
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
public class AdventureDao {

    @Autowired
    private SessionFactory sf;

    public AdventureDao() {
    }

    public AdventureDao(SessionFactory sf) {
        this.sf = sf;
    }

    public List<Adventure> getAll() {
        Query query = sf.getCurrentSession().createQuery("from Adventure");
        return query.list();
    }
    
     public void addAdventure(Adventure adventure) {
         sf.getCurrentSession().persist(adventure);
    }

}
