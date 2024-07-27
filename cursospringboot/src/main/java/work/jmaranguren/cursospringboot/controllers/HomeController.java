package work.jmaranguren.cursospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import work.jmaranguren.cursospringboot.models.User;


@Controller
public class HomeController {

    @GetMapping({"","/","home"})
    public String home() {

        return"redirect:list";
    }

    @GetMapping({"forward"})
    public String fordward() {

        return"forward:list";
    }
    
    
}
