package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(@RequestParam("name") String myName){


        //(http://localhost:8080/home?name=sunny)
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", myName);
        modelAndView.setViewName("home");
        return modelAndView;
    }


}
