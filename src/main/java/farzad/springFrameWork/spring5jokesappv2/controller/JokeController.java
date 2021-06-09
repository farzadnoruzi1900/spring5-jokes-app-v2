package farzad.springFrameWork.spring5jokesappv2.controller;

import farzad.springFrameWork.spring5jokesappv2.service.RandomJoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final RandomJoles randomJoles;

    public JokeController(RandomJoles randomJoles) {
        this.randomJoles = randomJoles;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model){
        model.addAttribute("joke",randomJoles.getJokes());
        return "index";
    }
}
