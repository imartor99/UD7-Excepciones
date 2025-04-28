public class Ejercicio6 {
    public static double accesoPorIndice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new RuntimeException("El índice " + j + " no existe en el array.");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    public static void main(String[] args) {
        double[] v = new double[15];
        // Creamos el manejador de la excepcion lanzada en el metodo
        try {
            System.out.println(accesoPorIndice(v, 16));
        } catch (RuntimeException e) {
            System.out.println("Error!!!! " + e.getMessage());
        }
    }
}
