package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", " Stock Photo Steve");
        model.addAttribute("power1", "Can make a verity of poses for your convenience");
        model.addAttribute("power2", "Free with you're download of an adobe program");
        model.addAttribute("power3", "Templates for lesons and used in meetings");
        model.addAttribute("fact1", "In his photos he never sits");
        model.addAttribute("fact2", "Wants to be in all you're office presentations");
        model.addAttribute("fact3", "48 different images of steve");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
