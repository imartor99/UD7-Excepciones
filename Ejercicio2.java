public class Ejercicio2 {
    public static void main(String[] args) {
        String aux = "hola";
        try {
            int aux2 = Integer.parseInt(aux);
        } catch (NumberFormatException e) {
            System.out.println("Valor asignado a la variable no corresponde con su tipo de dato.");
        }
        
    }
}
