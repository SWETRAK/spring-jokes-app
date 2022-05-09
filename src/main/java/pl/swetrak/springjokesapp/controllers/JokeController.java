package pl.swetrak.springjokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.swetrak.springjokesapp.services.JokeService;

@Controller // Marking class as Spring Controller `
public class JokeController {

    private final JokeService jokeService;

    @Autowired // Automatic wiring dependency to Joke Service
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }





}
