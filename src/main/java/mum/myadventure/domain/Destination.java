/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sajana
 */
@Entity
public class Destination implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String destinationName;

    @Column
    private String destinationDescription;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Region region;

    @OneToMany(mappedBy = "destination")
    private List<Adventure> adventures = new ArrayList<>();

    public Destination() {
    }

    public Destination(String destinationName, String destinationDescription) {
        this.destinationName = destinationName;
        this.destinationDescription = destinationDescription;
    }

    public void addAdventure(Adventure adventure) {
        this.adventures.add(adventure);
        adventure.setDestination(this);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationDescription() {
        return destinationDescription;
    }

    public void setDestinationDescription(String destinationDescription) {
        this.destinationDescription = destinationDescription;
    }

    public List<Adventure> getAdventures() {
        return adventures;
    }

    public void setAdventures(List<Adventure> adventures) {
        this.adventures = adventures;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "mum.myadventure.domain.Destination[ id=" + id + " ]";
    }

}
