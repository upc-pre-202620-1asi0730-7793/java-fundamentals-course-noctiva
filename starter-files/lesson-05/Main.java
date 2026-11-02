public class Main {
    public static void main(String[] args) {
        // Bucle for: (inicio; condición de parada; aumento de 1 en 1)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Estudiante " + i);
        }

        // Bucle while: primero creamos el contador por fuera
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Registro " + contador);
            // Sumamos 1 al contador para avanzar y evitar un bucle infinito
            contador++;
        }
    }
}