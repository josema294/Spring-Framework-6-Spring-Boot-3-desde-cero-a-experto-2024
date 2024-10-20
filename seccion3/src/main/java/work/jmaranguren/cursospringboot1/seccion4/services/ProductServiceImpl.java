package work.jmaranguren.cursospringboot1.seccion4.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
        // @Autowired
        // @Qualifier("productFoo")
        private ProductRepository repository;
        @Autowired
        private Environment environment;
        @Value("${config.price.tax}")
        private double tax;

        // //@Autowired {por constructor, y de hecho no es necesario el @autowired si inyectas por constructor, ya que lo hace de forma automatica}
         public ProductServiceImpl(@Qualifier("productList")ProductRepository repository) {
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
            System.out.println(environment.getProperty("config.price.tax"));
            //double conIVA = p.getPrice() * environment.getProperty("config.price.tax", Double.class);
            double conIVA = p.getPrice() * tax;
            // Product clonado = (Product) p.clonar();
            // clonado.setPrice(conIVA);
            // System.out.println("ProductServiceImpl.findAll()");
            // return clonado;
            p.setPrice(conIVA);
            return p;

        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }




}
