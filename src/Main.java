import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * Clase principal que ejecuta el programa de gestión de inventario.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Producto p1 = new Producto("Pipas", Categoria.COMIDA, 2, 0);
            ProductoConPromocion p2 =
                    new ProductoConPromocion("Pipas", Categoria.COMIDA, 2, 0,
                            LocalDate.of(2024, Month.JANUARY, 1), LocalDate.of(2026, Month.JANUARY, 1));
            ArrayList<ProductoBase> productos = new ArrayList<>();
            Inventario inventario = new Inventario(productos);
            inventario.agregarProducto(p1);
            inventario.agregarProducto(p2);
            inventario.aplicarDescuentoPorCategoria(Categoria.COMIDA, 10);
            System.out.println(inventario.calcularValorTotalInventario());
        } catch (DescuentoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
