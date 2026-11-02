// Lección 5: Bucles for y while
// Solución del ejercicio: muestra Estudiante 1 hasta Estudiante 10 con for y while.
public class Main {
    public static void main(String[] args) {
        // Solución principal con bucle for
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estudiante " + i);
        }

        // Solución adicional con bucle while
        int contador = 1;
        while (contador <= 10) {
            System.out.println("Registro " + contador);
            contador++;
        }
    }
}