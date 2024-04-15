package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.entities.Film;
import com.gestion.filmotheque.service.IServiceCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


import com.gestion.filmotheque.service.IServiceFilm;

@Controller
@RequestMapping("/film/")
public class FilmController {

    @Autowired
    private IServiceFilm iServiceFilm;
    @Autowired
    private IServiceCategorie iServiceCategorie;


    @GetMapping("all")
    public String getAllFilms(Model model) {
        model.addAttribute("films", iServiceFilm.findAllFilms());
        return "affiche";
    }
    @GetMapping ("new")
    public String afficheNewForm(Model model) {
        model.addAttribute("categories", iServiceCategorie.findAllCategories());
        return "ajout" ;
    }

    @PostMapping("add" )
    public String add (Film f) {
        iServiceFilm.createFilm(f);
 return "redirect:/film/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iServiceFilm.deleteFilm(id);
        return "redirect:/film/all";
    }
}
