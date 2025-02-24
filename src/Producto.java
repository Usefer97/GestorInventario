/**
 * Representa un producto en el inventario.
 */
public class Producto extends ProductoBase implements IDescuento {
    private double descuento;

    /**
     * Constructor de un producto.
     * @param nombre Nombre del producto.
     * @param categoria Categoría del producto.
     * @param precio Precio base del producto.
     * @param descuento Porcentaje de descuento aplicado.
     */
    public Producto(String nombre, Categoria categoria, double precio, double descuento) {
        super(nombre, categoria, precio);
        this.descuento = descuento;
    }

    @Override
    public void aplicarDescuentoPorcentual(double porcentaje) {
        this.descuento = porcentaje;
    }

    @Override
    public double getPrecioFinal() {
        return getPrecio() - (getPrecio() * (descuento / 100));
    }
}
