package work.jmaranguren.factura.springboot_factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import work.jmaranguren.factura.springboot_factura.models.Item;
import work.jmaranguren.factura.springboot_factura.models.Product;

@Configuration
@PropertySource("classpath:date.properties")
public class AppConfig {

@Bean
List<Item> itemsFacturas (){

    Product p1 = new Product("Camara Sony",800);
    Product p2 = new Product("Bicicleta ",1200);
    return Arrays.asList(new Item(p1,2), new Item(p2, 4));
}
    
}
