package work.jmaranguren.cursospringboot1.seccion4.services;

import java.util.List;
import java.util.stream.Collectors;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository();
    
    public List<Product> findAll(){

        List<Product> data = repository.findAll();
        // Retornamos una copia de los productos con el precio modificado
     
        return data.stream().map(p -> {
            //Product productoConIva = new Product(p.getId(), p.getName(), p.getPrice() * 1.25);
            //return productoConIva;
            double conIVA = p.getPrice() *1.25;
            Product clonado = (Product) p.clonar();
            clonado.setPrice(conIVA);
            return clonado;


        }).collect(Collectors.toList());
    }
    

    public Product findById(Long id) {
        return repository.findById(id);
    }

}
