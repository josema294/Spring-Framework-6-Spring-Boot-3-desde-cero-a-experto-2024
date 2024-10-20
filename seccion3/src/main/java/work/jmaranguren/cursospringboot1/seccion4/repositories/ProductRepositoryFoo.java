package work.jmaranguren.cursospringboot1.seccion4.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;

@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository{

    @Override
    public List<Product> findAll() {

        return Collections.singletonList(new Product(1L, "Monitor Asus 27", 600));
    }

    @Override
    public Product findById(Long id) {

        return new Product(1L, "Monitor Asus 27", 600);
    }


}
