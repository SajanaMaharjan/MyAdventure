/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mum.myadventure.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author sajana continents
 */
@Entity
public class Region {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String regionName;
    private String regionDescription;
    
    @OneToMany(mappedBy = "region",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Destination> destinations = new ArrayList<>();
    
    public Region() {
    }
    
    public Region(String regionName, String regionDescription) {
        this.regionName = regionName;
        this.regionDescription = regionDescription;
    }
    
    public void addDestination(Destination destination) {
        this.destinations.add(destination);
        destination.setRegion(this);
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getRegionName() {
        return regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public String getRegionDescription() {
        return regionDescription;
    }
    
    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
    
    
    
}
