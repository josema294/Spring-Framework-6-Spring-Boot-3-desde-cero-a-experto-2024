package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @GetMapping("/list")
    public String list(ModelMap model) {

        //List <User> users = new ArrayList<>();
       
        var users = usersModel ();

        
        model.addAttribute("title","Lista");
        model.addAttribute("users", users);
        return "list";
    }

    public List<User> usersModel (){
        
       var users = Arrays.asList(new User ("pepa","Tolomeo","1@2"), new User ("Lalo", "Perez","3@4"), new User ("Andres", "Herrero"));
        return users;
    }


    

    
    
}
