package work.jmaranguren.cursospringboot1.seccion3.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import work.jmaranguren.cursospringboot1.seccion3.models.Product;

@Repository("productList")
@Primary
// @RequestScope
@SessionScope
public class ProductRepositoryImpl implements ProductRepository {

    private List <Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria cortsair 32", 300.0),
            new Product(2L, "Procesador intel", 900.0),
            new Product(3L, "HDD", 90L),
            new Product(4L, "Teclado Razer", 60.0)
        );
    }

    public List<Product> findAll(){
        return data;
    }

    public Product findById (Long id){

        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);

    }

    

}
