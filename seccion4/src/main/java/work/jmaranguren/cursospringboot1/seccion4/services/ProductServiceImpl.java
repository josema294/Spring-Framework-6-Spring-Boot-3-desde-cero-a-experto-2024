package work.jmaranguren.cursospringboot1.seccion4.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository repository;

    //@Autowired {por constructor, y de hecho no es necesario el @autowired si inyectas por constructor, ya que lo hace de forma automatica}
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    // @Autowired   {por setter}
    // public void setRepository(ProductRepository repository) {
    //     this.repository = repository;
    // }



    public List<Product> findAll(){


        List<Product> data = repository.findAll();
        // Retornamos una copia de los productos con el precio modificado
     
        return data.stream().map(p -> {
            double conIVA = p.getPrice() *1.25;
            Product clonado = (Product) p.clonar();
            clonado.setPrice(conIVA);
            System.out.println("ProductServiceImpl.findAll()");
            return clonado;


        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }




}
