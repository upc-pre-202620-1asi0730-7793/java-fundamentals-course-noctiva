// Lección 3: Operadores y expresiones
// Solución del ejercicio: calcula el promedio y compáralo con 15.
public class Main {
    public static void main(String[] args) {
        int nota1 = 14;
        int nota2 = 16;
        int nota3 = 18;

        double promedio = (nota1 + nota2 + nota3) / 3.0;
        boolean superaQuince = promedio > 15;

        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor que 15: " + superaQuince);
    }
}
