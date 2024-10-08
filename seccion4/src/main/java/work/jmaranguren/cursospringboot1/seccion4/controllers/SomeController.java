package work.jmaranguren.cursospringboot1.seccion4.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.services.ProductServiceImpl;

@RestController
public class SomeController {

    private ProductServiceImpl productService = new ProductServiceImpl();

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
