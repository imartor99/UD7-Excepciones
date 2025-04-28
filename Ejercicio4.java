import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String leeTeclado = entrada.nextLine();

        try{
            char caracter = Ejercicio3.caracterEn(leeTeclado, 7);
            System.out.println("El caracter de la posición solicitada es: " + caracter);
        }catch(Exception e){
            System.out.println("Has intentado obtener un caracter de la cadena que no existe");
        }

        entrada.close();
    }
}
