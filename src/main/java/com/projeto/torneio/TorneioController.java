package com.projeto.torneio;

import com.projeto.torneio.models.Planet;
import com.projeto.torneio.repositories.PlanetRepository;
import net.sf.jsqlparser.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TorneioController {

    @Autowired
    private PlanetRepository repository;

    @GetMapping("/")
    public ModelAndView home() {
        List<Planet> planets = repository.findAll();
        ModelAndView view = new ModelAndView("index");
        view.addObject("planets", planets);
        return view;

    }

        @GetMapping("/register")
        public ModelAndView create () {
            ModelAndView view = new ModelAndView("create");
            view.addObject("planet", new Planet());
            return view;
        }

        @PostMapping("/register")
        public String createArena (Planet planet, Model model, BindingResult result){
            repository.save(planet);
            return "redirect:/";
        }

    }


