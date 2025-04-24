public class Ejercicio3 {
    // Escribe un método auxiliar de nombre caracterEn en Java que realice la
    // siguiente acción:
    // Recibe como parámetros una cadena (String) y un entero (int);
    // Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del
    // método “length():int” de la clase “String”) devuelve el carácter en la
    // posición
    // correspondiente (puedes hacer uso del método “charAt(int)” de la clase
    // “String”).
    // En caso contrario, construye y lanza una excepción de tipo Exception.
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posición está fuera del rango válido de la cadena.");
        }

    public static void main(String[] args) {

    }
}
