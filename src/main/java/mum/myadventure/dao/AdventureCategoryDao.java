/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dao;

import java.util.List;
import mum.myadventure.domain.AdventureCategory;
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
public class AdventureCategoryDao {

    @Autowired
    SessionFactory sessionFactory;

    public AdventureCategoryDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AdventureCategoryDao() {
    }

    public void addAdventureCategory(AdventureCategory adCat) {
        sessionFactory.getCurrentSession().persist(adCat);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<AdventureCategory> getAll() {
         Query query = sessionFactory.getCurrentSession().createQuery("from AdventureCategory");
        return query.list();
    }

}
