package work.jmaranguren.cursospringboot1.seccion4.services;

import java.util.List;
import java.util.stream.Collectors;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository(null);
    
    public List<Product> findAll(){
        return repository.findAll().stream().map(p ->{
            p.setPrice(p.getPrice() * 1.25);
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById() {
        return null;
    }

}
