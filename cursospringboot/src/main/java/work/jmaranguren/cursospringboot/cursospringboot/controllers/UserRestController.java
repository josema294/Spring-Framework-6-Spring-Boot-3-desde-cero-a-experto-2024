package work.jmaranguren.cursospringboot.cursospringboot.controllers;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot.cursospringboot.models.User;
import work.jmaranguren.cursospringboot.cursospringboot.models.dto.UserDTO;


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

        /* 
     * Se crea un nuevo endpoint details, esta vez usando una clase del dTO de la clase 18
     */
    @GetMapping("/details3")
    public UserDTO detailsDTO() {

       UserDTO userDTO = new UserDTO("dto example", new User("Menganito", "De la Pradera"));

       
        return userDTO;
    }

    
    @GetMapping("/detailslsit")
    public List<UserDTO> detailslsit() {

       UserDTO user1 = new UserDTO("dto 1", new User("Menganito", "Gonzalez"));
       UserDTO user2 = new UserDTO("dto 2", new User("Fulanito", "Perez"));
       UserDTO user3 = new UserDTO("dto 3", new User("Pepeito", "Dieguez"));

    //    List <UserDTO> lista = new ArrayList<>();
    //    lista.add(user1);
    //    lista.add(user2);
    //    lista.add(user3);

    List <UserDTO> lista = Arrays.asList(user1,user2,user3);
    

       
        return lista;
    }

    
}
