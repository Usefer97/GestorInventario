import java.util.ArrayList;

/**
 * Clase que representa un inventario de productos.
 */
public class Inventario {
    private ArrayList<ProductoBase> productos;

    /**
     * Constructor para inicializar el inventario.
     * @param productos Lista inicial de productos.
     */
    public Inventario(ArrayList<ProductoBase> productos) {
        this.productos = productos;
    }

    /**
     * Agrega un producto al inventario.
     * @param p Producto a agregar.
     */
    public void agregarProducto(ProductoBase p) {
        productos.add(p);
    }

    /**
     * Aplica un descuento a los productos de una categoría específica.
     * @param categoriaProducto Categoría a la que se aplicará el descuento.
     * @param descuento Porcentaje de descuento a aplicar.
     * @throws DescuentoInvalidoException Si el descuento no es válido.
     */
    public void aplicarDescuentoPorCategoria(Categoria categoriaProducto, double descuento) throws DescuentoInvalidoException {
        for (ProductoBase p : productos) {
            if (p.getCategoria() == categoriaProducto) {
                if (p instanceof Producto) {
                    ((Producto) p).aplicarDescuentoPorcentual(descuento);
                } else {
                    ((ProductoConPromocion) p).aplicarPromocion(descuento);
                }
            }
        }
    }

    /**
     * Calcula el valor total del inventario.
     * @return El valor total en dinero de todos los productos en inventario.
     */
    public double calcularValorTotalInventario() {
        double suma = 0;
        for (ProductoBase p : productos) {
            suma += p.getPrecioFinal();
        }
        return suma;
    }
}
