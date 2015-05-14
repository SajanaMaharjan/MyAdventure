/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Region;
import mum.myadventure.service.RegionService;
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
@RequestMapping("/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

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
    
//    @RequestMapping(value = "/addDestination", method=RequestMethod.GET)
//    public String addDestination(@param){
//        
//    }

}
