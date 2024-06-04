package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;


@RestController
public class UserRestController {

    @GetMapping("/details2")    
    public Map<String,Object> details() {

        Map<String, Object> body = new HashMap<String,Object>();
        body.put("title", "Hola mundo");

        return body;
        
    }
    
    
}
