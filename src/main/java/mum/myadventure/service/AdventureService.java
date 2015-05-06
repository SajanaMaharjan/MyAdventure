/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.service;

import java.util.List;
import mum.myadventure.dao.AdventureDao;
import mum.myadventure.domain.Adventure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AdventureService {
    
    @Autowired
    private AdventureDao adventureDao;

    public List<Adventure> getAll() {
        return adventureDao.getAll();
    }

    public void addAdventure(Adventure adventure) {
       
        adventureDao.addAdventure(adventure);
    
}
}
