/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.service;

import java.util.List;
import mum.myadventure.dao.RegionDao;
import mum.myadventure.domain.Region;
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
public class RegionService {

    @Autowired RegionDao regionDao;
    
    public void addRegion(Region region) {
        regionDao.addRegion(region);
    }

    public List<Region> getAll() {
            return regionDao.getAll();
    }

    public Region getRegionById(long id) {
        return regionDao.getRegionById(id);
    }
    
      public Region update(Region region){
          region = getRegionById(region.getId());
        return regionDao.update(region);
    }
    
}
