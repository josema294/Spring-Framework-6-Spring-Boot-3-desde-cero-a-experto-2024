package work.jmaranguren.cursospringboot1.seccion3.services;

import java.util.List;

import work.jmaranguren.cursospringboot1.seccion3.models.Product;

public interface ProductService {

    List<Product> findAll();
    Product findById (Long id);

}
