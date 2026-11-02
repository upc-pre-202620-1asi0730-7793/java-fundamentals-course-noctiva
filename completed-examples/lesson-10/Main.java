// Lección 10: Proyecto final: Registro de estudiantes.
// Solución del ejercicio: comprueba cinco resultados y prueba una nota inválida.
class Estudiante {
    private String nombre;
    private int nota;

    Estudiante(String nombre, int nota) {
        if (nota < 0 || nota > 20) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 20");
        }
        this.nombre = nombre;
        this.nota = nota;
    }

    void mostrarResultado() {
        String estado;
        if (nota >= 13) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }
        System.out.println(nombre + ": " + estado);
    }
}

public class Main {
    public static void main(String[] args) {
        // Solución: array ampliado con los dos nuevos estudiantes
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 17),
            new Estudiante("Luis", 11),
            new Estudiante("Carlos", 15),
            new Estudiante("Lucia", 18),
            new Estudiante("Pedro", 10)
        };

        // Recorrido de los 5 resultados
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarResultado();
        }

        // Solución al desafío opcional: Descomentar la siguiente línea causa
        // el error IllegalArgumentException: La nota debe estar entre 0 y 20
        // Estudiante estudianteInvalido = new Estudiante("Error", 25);
    }
}