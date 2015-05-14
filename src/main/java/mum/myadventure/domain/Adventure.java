/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author sajana
 */
@Entity
public class Adventure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String adventureName;
    private String adventureDescription;
    
//    cascade save destination object when you save adventure object
    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name="destinationId")
    private Destination destination;


    public Adventure() {
    }

    public Adventure(String adventureName, String adventureDescription) {
        this.adventureName = adventureName;
        this.adventureDescription = adventureDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdventureName() {
        return adventureName;
    }

    public void setAdventureName(String adventureName) {
        this.adventureName = adventureName;
    }

    public String getAdventureDescription() {
        return adventureDescription;
    }

    public void setAdventureDescription(String adventureDescription) {
        this.adventureDescription = adventureDescription;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    
}
