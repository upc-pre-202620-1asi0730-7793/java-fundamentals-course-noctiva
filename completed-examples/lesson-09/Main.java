// Lección 9: Arrays y cadenas de texto.
// Solución del ejercicio: muestra nombre y cantidad de caracteres mediante un bucle.
public class Main {
    public static void main(String[] args) {
        // Solución principal: array con cinco nombres
        String[] nombres = {"Ana", "Luis", "Carlos", "Lucia", "Pedro"};

        // Solución del bucle
        for (String nombre : nombres) {
            System.out.println(nombre + ": " + nombre.length() + " letras");
        }
    }
}