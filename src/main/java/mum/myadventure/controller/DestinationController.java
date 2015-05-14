/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Adventure;
import mum.myadventure.domain.Destination;
import mum.myadventure.dto.DestinationAdventureDTO;
import mum.myadventure.service.AdventureService;
import mum.myadventure.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sajana
 */
@Controller
@RequestMapping("/destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @Autowired
    private AdventureService adventureService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllDestinations(Model model) {
        model.addAttribute("destinations", destinationService.getAll());
        return "DestinationList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addDestination(@ModelAttribute DestinationAdventureDTO dto) {
        return "admin/addDestination";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addDestination(@Valid DestinationAdventureDTO dto, BindingResult result) {
        if (!result.hasErrors()) {
            destinationService.addDestination(dto.getDestination());
            return "redirect:/destination/listAll";
        }
        return "admin/addDestination";
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String viewDestination(@PathVariable long id, Model model) {

        System.out.println("destuin__+: " + id);
        Destination destination = destinationService.getDestinationById(id);
        model.addAttribute("selectedDestination", destination);
//        System.out.println("course name is: " + destination.getDestinationName());
//        model.addAttribute("reviews", course.getReviews());
//        model.addAttribute("review", new Review());
        return "Destination";
    }

    @RequestMapping(value = "/addAdventure/{id}", method = RequestMethod.GET)
    public String addAdventure(@PathVariable long id) {
        System.out.println("add avent--" + id);
//        if (!result.hasErrors()){
//            
//            adventure.setId(0);
//            Destination destination = destinationService.getDestinationById(id);
//            destination.addAdventure(adventure);
//            adventureService.addAdventure(adventure);
//            destinationService.update(destination);
        return ("redirect:/add");
//        }
//        return "adventure/listAll/{id}";
    }

    @RequestMapping(value = "/saveAdventure", method = RequestMethod.POST)
    public String saveAdventure(@Valid DestinationAdventureDTO dto, BindingResult result) {
//        System.out.println("add avent--" + id);
        if (!result.hasErrors()) {
//            Destination destination = destinationService.getDestinationById(id);
            Destination destination = dto.getDestination();
            destination.addAdventure(dto.getAdventure());
            adventureService.addAdventure(dto.getAdventure());
            return ("redirect:/destination/view/" + String.valueOf(destination.getId()));
        }
        return "adventure/listAll/{id}";
    }
}
