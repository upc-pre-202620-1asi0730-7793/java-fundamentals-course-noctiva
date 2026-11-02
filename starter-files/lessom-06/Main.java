// Importamos Scanner para que Java pueda leer lo que se escribe en el teclado
import java.util.Scanner;

public class Main {
    // Metodo propio: recibe el texto en la variable "nombre" y realiza la acción
    static void mostrarBienvenida(String nombre) {
        System.out.println("Bienvenido, " + nombre);
    }

    public static void main(String[] args) {
        // Creamos el lector conectado al teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        // Pausa el programa hasta que el usuario escribe su nombre y presiona Enter
        String nombre = scanner.nextLine();

        // Llamamos a nuestro método y le enviamos el nombre capturado
        mostrarBienvenida(nombre);

        scanner.close(); // Buena práctica: cerramos el lector al terminar
    }
}