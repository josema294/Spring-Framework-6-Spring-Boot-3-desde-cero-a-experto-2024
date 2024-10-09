package work.jmaranguren.cursospringboot1.seccion4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.services.ProductService;

@RestController
public class SomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    @RequestMapping("/api")
    public List<Product> list(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product show (@PathVariable Long id){

        return productService.findById(id);
    }

}
