/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import javax.validation.Valid;
import mum.myadventure.domain.AdventureCategory;
import mum.myadventure.service.AdventureCategoryService;
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
@RequestMapping("/adventureCategory")
public class AdventureCategoryController {

    @Autowired
    private AdventureCategoryService adventureCategoryService;
    private Object model;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)    
    public String listAllAdventCat(@ModelAttribute AdventureCategory adventureCategory, Model model) {
//        model.addAttribute("regions", adCatSer.getAll());
         model.addAttribute("adventureCategories", adventureCategoryService.getAll());
        return "admin/addAdventureCategory";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void addAdventCategory(@Valid AdventureCategory adventureCategory, BindingResult result) {
        if (!result.hasErrors()) {
            adventureCategoryService.addAdventureCategory(adventureCategory);
//            return "redirect:/destination/listAll";
        }
//        return "admin/addDestination";
    }
}
