package work.jmaranguren.cursospringboot1.seccion4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import work.jmaranguren.cursospringboot1.seccion4.repositories.ProductRepository;

@Configuration
@PropertySource("classpath:config.properties")
public class appConfig {

    @Bean
     ProductRepository ProductRepositoryJson(){
        return new work.jmaranguren.cursospringboot1.seccion4.repositories.json.ProductRepositoryJson() {
        
        };
    }

}
