/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Location;
import mum.myadventure.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sajana
 */
@Controller
@RequestMapping(value = {"/", "/location"})
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String location(@ModelAttribute Location location) {
        return "index";
    }
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllLocations(Model model) {
        model.addAttribute("locations", locationService.getAll());
        return "Location";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addLocation(@ModelAttribute Location location) {
        return "admin/addLocation";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addLocation(@Valid Location location, BindingResult result) {
        if (!result.hasErrors()) {
            locationService.addLocation(location);
            return "redirect:/location/listAll";
        }
        return "AddLocation";
    }

}
