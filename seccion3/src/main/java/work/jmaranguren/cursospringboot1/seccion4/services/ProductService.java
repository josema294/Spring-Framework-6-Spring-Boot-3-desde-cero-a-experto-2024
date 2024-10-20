package work.jmaranguren.cursospringboot1.seccion4.services;

import java.util.List;
import work.jmaranguren.cursospringboot1.seccion4.models.Product;

public interface ProductService {

    List<Product> findAll();
    Product findById (Long id);

}
