// Lección 6: Métodos, parámetros y Scanner
// Solución del ejercicio: crea mostrarDespedida y llámalo después de mostrarBienvenida.
import java.util.Scanner;

public class Main {
    static void mostrarBienvenida(String nombre) {
        System.out.println("Bienvenido, " + nombre);
    }

    static void mostrarDespedida(String nombre) {
        System.out.println("Hasta luego, " + nombre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        mostrarBienvenida(nombre);
        mostrarDespedida(nombre);

        scanner.close();
    }
}