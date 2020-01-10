package com.example.demo.controller;

import com.example.demo.Dao.AlienRepo;
import com.example.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;
    private int aid;

    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }

    @PostMapping(path="/alien",consumes = "application/json")
    public Alien addAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }


    @GetMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam(value = "aid", required = true) int aid){

        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());

        System.out.println(repo.findByTech("java"));
        System.out.println(repo.findByaIDGreaterThan(2));
        System.out.println(repo.findByaIDSorted("java"));
        mv.addObject(alien);
        return mv;
    }

    @RequestMapping(value = "/aliens")
    public List<Alien> aliens(){
        return repo.findAll();

    }

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlienByID(@PathVariable("aid") int aid){

        return repo.findById(aid);

    }

}
