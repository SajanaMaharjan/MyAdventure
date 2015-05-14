/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.myadventure.controller;

import mum.myadventure.domain.Destination;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sajana
 */

@Controller
//@RequestMapping("")
public class DefaultController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String destination(@ModelAttribute Destination destination) {
        return "index";
    }
}
