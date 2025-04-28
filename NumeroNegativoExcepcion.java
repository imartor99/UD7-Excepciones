public class NumeroNegativoExcepcion extends Exception {
    // Constructor sin parametros
    public NumeroNegativoExcepcion() {
        super();
    }

    // Constructor que recibe un mensaje
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }

}
