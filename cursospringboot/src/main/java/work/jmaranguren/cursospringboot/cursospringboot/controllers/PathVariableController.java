package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

import work.jmaranguren.cursospringboot.cursospringboot.models.dto.ParamDTO;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

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
     

}
