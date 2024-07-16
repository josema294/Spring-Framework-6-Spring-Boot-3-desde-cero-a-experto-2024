package work.jmaranguren.cursospringboot.cursospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot.cursospringboot.models.dto.ParamDTO;
import work.jmaranguren.cursospringboot.cursospringboot.models.dto.ParamMixDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestPAramsController {

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "hola que tal") String message) {
        
        var param = new ParamDTO();
        //Con el defaultvalue ya no hace falta comprobar si es nulo o no
        //param.setMessage(message==null?"Hola no hay parametro que pasar":message);
        param.setMessage(message==null?"Hola no hay parametro que pasar":message);

        return param;
    }
    
@GetMapping("/bar")
public ParamMixDTO getMethodName(@RequestParam String text, @RequestParam Integer code) {
    
    var param = new ParamMixDTO();
    param.setMessage(text);
    param.setCod(code);
    return param;
}

    
    
}
