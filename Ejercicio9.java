public class Ejercicio9 {
    public static double accesoPorIndice(double[] v, int j) throws Exception {
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

    public static void main(String [] args){
        double[] v = new double[15];
        try {
            System.out.println(accesoPorIndice(v, 16));
        } catch (Exception e) {
            System.out.println("¡¡ERROR!! " + e.getMessage());
        }
        }
}
