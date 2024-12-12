package com.laraib.Infomanager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page");
        model.addAttribute("name","Laraib");
        model.addAttribute("Work","SDE");
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("About Page");
      
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        System.out.println("Services Page");
      
        return "services";
    }
}
