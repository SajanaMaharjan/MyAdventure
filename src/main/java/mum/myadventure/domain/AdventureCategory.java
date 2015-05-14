/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sajana
 */
@Entity
public class AdventureCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String adventureCatName;
    private String adventureCatDescription;

    public AdventureCategory() {
    }
    

    public AdventureCategory(String adventureCatName, String adventureCatDescription) {
        this.adventureCatName = adventureCatName;
        this.adventureCatDescription = adventureCatDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdventureCatName() {
        return adventureCatName;
    }

    public void setAdventureCatName(String adventureCatName) {
        this.adventureCatName = adventureCatName;
    }

    public String getAdventureCatDescription() {
        return adventureCatDescription;
    }

    public void setAdventureCatDescription(String adventureCatDescription) {
        this.adventureCatDescription = adventureCatDescription;
    }
    
    
    
    
}
