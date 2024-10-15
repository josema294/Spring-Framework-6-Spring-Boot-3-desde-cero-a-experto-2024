package work.jmaranguren.cursospringboot1.seccion4.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;

@Repository
@Primary
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
