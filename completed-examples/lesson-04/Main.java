// Lección 4: Condicionales if, else if y else.
// Solución del ejercicio: clasificación de notas.
public class Main {
    public static void main(String[] args) {
        int nota = 20;

        if (nota >= 18) {
            System.out.println("Sobresaliente");
        } else if (nota >= 13) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
