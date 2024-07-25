package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import work.jmaranguren.cursospringboot.cursospringboot.models.User;
import work.jmaranguren.cursospringboot.cursospringboot.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("#{ '${config.listOfValues}'.toUpperCase.split(',')} ")
    private List<String> valueList;



    @GetMapping("/baz/{message}")
    public ParamDTO baz (@PathVariable String message){

        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

     @GetMapping("/mix/{product}/{id}")
     public Map<String, Object> mixPathVar(@PathVariable String product,@PathVariable String id) {

        Map<String, Object> json = new HashMap<>();
        json.put("product",product);
        json.put("id",id);
        return json;
    }
    
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        
        return user;
    }
    
   @GetMapping("/values")
    public Map <String, Object> values(){

        Map<String, Object> json = new HashMap<String, Object>();
        json.put("username", 12323);
        json.put("message", message);
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        

        return json ;
            
        
    }




}
