/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.service;

import mum.myadventure.dao.AdventureCategoryDao;
import mum.myadventure.domain.AdventureCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */
@Service
@Transactional
public class AdventureCategoryService {

    @Autowired AdventureCategoryDao adCatDao;
    
    public void addAdventureCategory(AdventureCategory adventureCategory) {
        adCatDao.addAdventureCategory(adventureCategory);
    }
    
}
