package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import work.jmaranguren.cursospringboot.cursospringboot.models.User;

@Controller
public class UserController {

    @GetMapping("/details")    
    public String details(Model model) {

        // model.addAttribute("title", "Hola mundo Spring Boot");
        // model.addAttribute("name", "Paquito");
        // model.addAttribute("lastname", "El Chocolatero");

        //Lo modificamos para agregar el objeto user que hemos introducido del modelo

        User user = new User("Anastasio","Wenceslao");

        user.setEmail("ahorasitieneemail@gmail.com");

        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user",user);
       
        return "details";
    }

    
    
}
