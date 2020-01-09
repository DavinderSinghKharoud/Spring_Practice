package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(String name, HttpSession session){

        System.out.println(name);

        //(http://localhost:8080/home?name=sunny)
        session.setAttribute("name", name);
        System.out.println("hi");
        return "home";
    }


}
