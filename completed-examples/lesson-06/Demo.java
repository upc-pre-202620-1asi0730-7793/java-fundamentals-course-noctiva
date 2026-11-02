// Lección 6: Código utilizado durante la demostración[cite: 2].
// Para ejecutarlo en un editor online que requiere Main, copia el
// contenido en Main.java y cambia "class Demo" por "class Main".
import java.util.Scanner;

class Demo {
    static void mostrarBienvenida(String nombre) {
        System.out.println("Bienvenido, " + nombre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        mostrarBienvenida(nombre);
        scanner.close();
    }
}