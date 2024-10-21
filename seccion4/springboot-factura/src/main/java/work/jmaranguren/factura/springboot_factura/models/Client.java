package work.jmaranguren.factura.springboot_factura.models;

import org.springframework.stereotype.Component;

@Component
public class Client {

    private String nombre;
    private String Apellido;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    
}
