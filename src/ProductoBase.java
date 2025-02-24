/**
 * Clase base para representar productos en el inventario.
 */
public abstract class ProductoBase {
    private String nombre;
    private Categoria categoria;
    private double precio;

    public ProductoBase(String nombre, Categoria categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract double getPrecioFinal();
}