package work.jmaranguren.cursospringboot1.seccion3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import work.jmaranguren.cursospringboot1.seccion3.repositories.ProductRepository;

@Configuration
@PropertySource("classpath:config.properties")
public class appConfig {

    @Bean
     ProductRepository ProductRepositoryJson(){
        return new work.jmaranguren.cursospringboot1.seccion3.repositories.json.ProductRepositoryJson() {
        
        };
    }

}
