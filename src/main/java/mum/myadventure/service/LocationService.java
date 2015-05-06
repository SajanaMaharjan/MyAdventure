package mum.myadventure.service;

import java.util.List;
import mum.myadventure.dao.LocationDao;
import mum.myadventure.domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sajana
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class LocationService {

    @Autowired
    private LocationDao locationDao;

    public List<Location> getAll() {
        return locationDao.getAll();
    }

    public void addLocation(Location location) {

        locationDao.addLocation(location);

    }

}
