package work.jmaranguren.factura.springboot_factura.models;

public class Item {

    private Product pproducto;
    private Integer cantidad;
    

    public Item(Product pproducto, Integer cantidad) {
        this.pproducto = pproducto;
        this.cantidad = cantidad;
    }
    public Product getPproducto() {
        return pproducto;
    }
    public void setPproducto(Product pproducto) {
        this.pproducto = pproducto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    

}
