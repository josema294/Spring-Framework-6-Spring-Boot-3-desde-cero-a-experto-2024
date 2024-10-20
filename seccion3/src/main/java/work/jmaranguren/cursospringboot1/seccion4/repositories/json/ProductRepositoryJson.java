package work.jmaranguren.cursospringboot1.seccion4.repositories.json;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import work.jmaranguren.cursospringboot1.seccion4.models.Product;
import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

public class ProductRepositoryJson implements ProductRepository {

    private List<Product> list;
    public ProductRepositoryJson(){
        Resource resource = new ClassPathResource("json/product.json");
        ObjectMapper objetMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objetMapper.readValue(resource.getFile(),Product[].class));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }   

    @Override
    public List<Product> findAll() {

        return null;
    }

    @Override
    public Product findById(Long id) {

        return list.stream().filter( p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
    
}
