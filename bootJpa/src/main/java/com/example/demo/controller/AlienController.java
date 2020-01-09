package com.example.demo.controller;

import com.example.demo.Dao.AlienRepo;
import com.example.demo.model.Alien;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){

        repo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam(value = "aid", required = true) int aid){

        ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien alien = repo.findById(aid).orElse(new Alien());

        System.out.println(repo.findByTech("java"));
        System.out.println(repo.findByaIDGreaterThan(2));
        System.out.println(repo.findByaIDSorted("java"));
        mv.addObject(alien);
        return mv;
    }
}
