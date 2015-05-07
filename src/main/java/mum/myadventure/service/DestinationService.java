package mum.myadventure.service;

import java.util.List;
import mum.myadventure.dao.DestinationDao;
import mum.myadventure.domain.Destination;
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
public class DestinationService {

    @Autowired
    private DestinationDao destinationDao;

    public List<Destination> getAll() {
        return destinationDao.getAll();
    }

    public void addDestination(Destination destination) {

        destinationDao.addDestination(destination);

    }

    public Destination getDestinationById(long id) {
         return destinationDao.getDestinationById(id);
    }

}
