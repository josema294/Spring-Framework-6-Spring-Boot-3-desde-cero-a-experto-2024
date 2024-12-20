package work.jmaranguren.cursospringboot1.seccion3.models;

public class Product implements Cloneable {

    private Long id;
    private String name;
    private double price;
    public Product(Long id, String name, double d) {
        this.id = id;
        this.name = name;
        this.price = d;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double d) {
        this.price = d;
    }

    public Object clonar(){

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new Product(id, name, price);
        }   
    }

    

}
