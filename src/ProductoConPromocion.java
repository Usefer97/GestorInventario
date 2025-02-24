import java.time.LocalDate;

/**
 * Representa un producto con una promoción dentro de un rango de fechas.
 */
public class ProductoConPromocion extends ProductoBase {
    private double descuento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    /**
     * Constructor de un producto con promoción.
     * @param nombre Nombre del producto.
     * @param categoria Categoría del producto.
     * @param precio Precio base del producto.
     * @param descuento Porcentaje de descuento aplicado.
     * @param fechaInicio Fecha de inicio de la promoción.
     * @param fechaFin Fecha de finalización de la promoción.
     */
    public ProductoConPromocion(String nombre, Categoria categoria, double precio, double descuento, LocalDate fechaInicio, LocalDate fechaFin) {
        super(nombre, categoria, precio);
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Aplica una promoción si está dentro del rango de fechas.
     * @param porcentaje Porcentaje de descuento adicional.
     */
    public void aplicarPromocion(double porcentaje) {
        this.descuento += porcentaje;
    }

    @Override
    public double getPrecioFinal() {
        return getPrecio() - (getPrecio() * (descuento / 100));
    }
}