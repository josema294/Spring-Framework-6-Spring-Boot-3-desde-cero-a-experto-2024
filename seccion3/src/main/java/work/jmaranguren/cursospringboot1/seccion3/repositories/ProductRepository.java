package work.jmaranguren.cursospringboot1.seccion3.repositories;

import java.util.List;

import work.jmaranguren.cursospringboot1.seccion3.models.Product;

public interface ProductRepository {

    List <Product> findAll();
    Product findById(Long id);

}
