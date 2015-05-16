/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Destination;
//import mum.myadventure.domain.Destination;
import mum.myadventure.domain.Region;
import mum.myadventure.dto.DestinationAdventureDTO;
import mum.myadventure.service.DestinationService;
import mum.myadventure.service.RegionService;
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
@RequestMapping("/region")
public class RegionController {
    
    @Autowired
    private RegionService regionService;
    
    @Autowired
    private DestinationService destinationService;
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllRegions(Model model, @ModelAttribute Region region) {
        model.addAttribute("regions", regionService.getAll());
        return "admin/addRegion";
    }

    /**
     *
     * @param region
     * @param model
     * @return
     */
//    @RequestMapping(value = "/add", method=RequestMethod.GET)
//    public String addRegion(@ModelAttribute Region region){
////          model.addAttribute("regions", regionService.getAll());
//        
//        return "admin/addRegion";
//    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRegion(@Valid Region region, BindingResult result) {
        
        if (!result.hasErrors()) {
            regionService.addRegion(region);
//            return "redirect:/region/listAll";
            return "redirect:/region/listAll";
        }
        
        return "redirect:/region/listAll";
    }
    
    @RequestMapping(value = "/addDestination/{id}", method = RequestMethod.GET)
    public String addDestination(@PathVariable long id, Model model, @ModelAttribute Destination destination) {
        
        Region region = regionService.getRegionById(id);
        model.addAttribute("selectedRegion", region);

//        System.out.println("course name is: " + destination.getDestinationName());
//        model.addAttribute("reviews", course.getReviews());
//        model.addAttribute("review", new Review());
        return "admin/addDestination";
        
    }
    
    @RequestMapping(value = "/addDestination/save/{id}", method = RequestMethod.POST)
    public String saveDestination(@PathVariable long id, Model model, @Valid Destination destination, BindingResult result) {
        System.out.println("Destin ::" + destination.getDestinationName() + "id__=" + id);

        if (!result.hasErrors()) {
            
            Region region = regionService.getRegionById(id); 
            
//           destination id  alredy model ma set vayecha /addDestination/{id} ko @path variable bata so save 
            destination.setId(0);
            
//            a possible soln
//            Destination destinationOne = new Destination(destination.getDestinationName(), destination.getDestinationDescription());
            
            destinationService.addDestination(destination);
            region.addDestination(destination);
            regionService.update(region);
            model.addAttribute("selectedRegion", region);
            model.addAttribute("destination", destination);
                        
            return ("redirect:/destination/view/" + String.valueOf(destination.getId()));
        }
//        return "adventure/listAll/{id}";
        return "/admin/addDestination";
    }
    
}
