package work.jmaranguren.cursospringboot1.seccion4.repositories;

import java.util.List;
import work.jmaranguren.cursospringboot1.seccion4.models.Product;

public interface ProductRepository {

    List <Product> findAll();
    Product findById(Long id);

}
