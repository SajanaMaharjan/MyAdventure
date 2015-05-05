/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import mum.myadventure.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sajana
 */
@Controller
@RequestMapping(value = {"/","/location"})
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllLocations(Model model) {
        model.addAttribute("locations", locationService.getAll());
        return "Location";
    }

}
