package work.jmaranguren.cursospringboot.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot.models.User;
import work.jmaranguren.cursospringboot.models.dto.ParamDTO;


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
    @Value("#{${config.valuesMap}}")
    private Map<String,Object> valuesMap;
    @Value("#{${config.valuesMap}.product}")
    private String productName;
    @Value("#{${config.valuesMap}.price}")
    private String productPrice;
    @Autowired
    private Environment enviroment;

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
        json.put("message2", enviroment.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valuesMap", valuesMap);
        json.put("productPrice", productPrice);
        json.put("productName", productName);
        
       
        return json ;
            
        
    }




}
