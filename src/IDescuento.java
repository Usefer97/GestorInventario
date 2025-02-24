/**
 * Interfaz para aplicar descuentos a los productos.
 */
public interface IDescuento {
    /**
     * Aplica un descuento a un producto.
     * @param porcentaje Porcentaje de descuento a aplicar.
     */
    void aplicarDescuentoPorcentual(double porcentaje);
}
