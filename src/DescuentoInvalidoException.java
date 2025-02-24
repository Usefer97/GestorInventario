/**
 * Excepción personalizada para manejar descuentos inválidos.
 */
public class DescuentoInvalidoException extends Exception {
    /**
     * Constructor de la excepción.
     * @param mensaje Mensaje de error.
     */
    public DescuentoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
