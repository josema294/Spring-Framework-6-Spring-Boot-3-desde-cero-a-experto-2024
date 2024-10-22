package work.jmaranguren.factura.springboot_factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import work.jmaranguren.factura.springboot_factura.models.Item;
import work.jmaranguren.factura.springboot_factura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

@Bean
List<Item> itemsFacturas (){

    Product p1 = new Product("Camara Sony",800);
    Product p2 = new Product("Bicicleta ",1200);
    return Arrays.asList(new Item(p1,2), new Item(p2, 4));
}

@Bean("default")
//@Primary
List<Item> itemsFacturasOficina (){

    Product p1 = new Product("Monitor Asus 24",800);
    Product p2 = new Product("Notebook Razer ",1200);
    Product p3 = new Product("Impresora HP",800);
    Product p4 = new Product("Excriorio oficina ",900);
    return Arrays.asList(new Item(p1,4), new Item(p2, 6),new Item(p3, 1),new Item(p4, 4));
}

    
}
