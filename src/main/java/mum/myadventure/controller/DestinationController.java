/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Adventure;
import mum.myadventure.domain.Destination;
import mum.myadventure.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sajana
 */
@Controller
@RequestMapping("destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String destination(@ModelAttribute Destination destination) {
        return "index";
    }
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllDestinations(Model model) {
        model.addAttribute("destinations", destinationService.getAll());
        return "DestinationList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addDestination(@ModelAttribute Destination destination) {
        return "admin/addDestination";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addDestination(@Valid Destination destination, BindingResult result) {
        if (!result.hasErrors()) {
            destinationService.addDestination(destination);
            return "redirect:/destination/listAll";
        }
        return "AddDestination";
    }
    
     @RequestMapping (value="/view/{id}", method=RequestMethod.GET)
    public String viewDestination(@PathVariable long id, Model model){
        Destination destination = destinationService.getDestinationById(id);
        model.addAttribute("selectedDestination", destination);
//        System.out.println("course name is: " + destination.getDestinationName());
//        model.addAttribute("reviews", course.getReviews());
//        model.addAttribute("review", new Review());
        return "Destination";
    }
    
//     @RequestMapping (value="/adventure/add/{id}", method=RequestMethod.POST)
//    public String addAdventure(@Valid Adventure adventure, BindingResult result, @PathVariable long id){
//        if (!result.hasErrors()){
//          
//            adventure.setId(0);
//            Destination destination = destinationService.getDestinationById(id);
//            System.out.println("debug 1");
//            destinationService.addAdventure(adventure);
//            System.out.println("debug 2");
//            destination.addAdventure(adventure);
//            System.out.println("debug 3");
//            destinationService.update(destination);
//            System.out.println("debug 4");
//            return ("redirect:/destination/view/" + String.valueOf(id));
//        }
//        return "adventure/listAll/{id}";
//    }

}
