package com.example.spring5jokesapp.controllers;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    // Since the "ChuckNorrisQuotes" class is not a Spring component, we have to create a bean of it ourselves in the
    // configuration file
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public JokeController(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
