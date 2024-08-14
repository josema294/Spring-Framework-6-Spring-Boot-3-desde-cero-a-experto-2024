package work.jmaranguren.cursospringboot1.seccion4.models;

public class Product {

    private Long id;
    private String name;
    private Long price;
    public Product(Long id, String name, double d) {
        this.id = id;
        this.name = name;
        this.price = d;
    }
    public Product(long id2, String name2, double d) {
        //TODO Auto-generated constructor stub
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
    public Long getPrice() {
        return price;
    }
    public void setPrice(double d) {
        this.price = d;
    }

    

}
