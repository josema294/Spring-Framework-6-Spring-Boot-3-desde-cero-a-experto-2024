package work.jmaranguren.factura.springboot_factura.models;

public class Product {

    private String name;
    private Integer precio;
    

    public Product(String name, Integer precio) {
        this.name = name;
        this.precio = precio;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    

}
