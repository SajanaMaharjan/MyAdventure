/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.dto;

import javax.validation.Valid;
import mum.myadventure.domain.Adventure;
import mum.myadventure.domain.Destination;

/**
 *
 * @author sajana
 */
public class DestinationAdventureDTO {
    private String destinationName;
    private String destinationDescription;
    private String adventureName;
    private String adventureDescription;

    public DestinationAdventureDTO() {
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
    
    @Valid
    public Destination getDestination(){
        return new Destination(this.destinationName, this.destinationDescription);
    }
    
    @Valid
    public Adventure getAdventure(){
        return new Adventure(this.adventureName, this.adventureDescription);
    }
}
