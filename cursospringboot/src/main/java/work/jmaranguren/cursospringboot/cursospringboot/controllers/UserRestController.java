package work.jmaranguren.cursospringboot.cursospringboot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot.cursospringboot.models.User;

import java.util.Map;
import java.util.HashMap;


@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details")    
    public Map<String,Object> details() {

        Map<String, Object> body = new HashMap<String,Object>();
        body.put("title", "Hola mundo");

        return body;
        
    }

    
    /* 
     * Se crea un nuevo endpoint details, esta vez usando una clase del modelo.
     */
    @GetMapping("/details2")
    public Map<String, Object> getMethodName() {

        Map<String, Object> body = new HashMap<>();

        User user = new User("Paco","Perez");

        body.put("titulo", "Hola mundo");
        body.put("user", user);

        return body;
    }
    
    
}
