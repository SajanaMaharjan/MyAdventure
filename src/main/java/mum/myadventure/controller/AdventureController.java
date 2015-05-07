/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.Adventure;
import mum.myadventure.service.AdventureService;
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
@RequestMapping(value={"/","/adventure"})
public class AdventureController {
    
  @Autowired
  private AdventureService adventureService;
    
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String listAllAdventures(Model model) {
        model.addAttribute("adventures", adventureService.getAll());
        return "adventure";
    }

    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String addAdventure(@ModelAttribute Adventure adventure) {
        return "admin/addAdventure";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addAdventure(@Valid Adventure adventure, BindingResult result) {
        if (!result.hasErrors()) {
            adventureService.addAdventure(adventure);
            return "redirect:/adventure/listAll";
        }
        return "adventure";
    }
    
}
