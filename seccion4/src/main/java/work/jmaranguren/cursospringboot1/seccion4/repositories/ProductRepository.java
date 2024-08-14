package work.jmaranguren.cursospringboot1.seccion4.repositories;

import java.util.Arrays;
import java.util.List;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;

public class ProductRepository {

    private List <Product> data;

    public ProductRepository(List<Product> data) {
        this.data = Arrays.asList(
            new Product(1L, "Memoria cortsair 32", 300L),
            new Product(2L, "Procesador intel", 900L),
            new Product(3L, "HDD", 90L),
            new Product(4L, "Teclado Razer", 60L)
        );
    }

    public List<Product> findAll(){
        return data;
    }

    public Product findById (Long id){

        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);

    }

    

}
