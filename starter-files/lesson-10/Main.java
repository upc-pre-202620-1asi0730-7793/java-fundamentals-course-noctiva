// Lección 10: Proyecto final: Registro de estudiantes.
// Actividad: Agrega dos estudiantes al array y opcionalmente prueba una nota inválida.
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
        // TODO: Agrega dos nuevos estudiantes al array (ej. Lucia con 18 y Pedro con 10).
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 17),
            new Estudiante("Luis", 11),
            new Estudiante("Carlos", 15)
        };

        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarResultado();
        }

        // TODO (Desafío opcional): Intenta crear un estudiante con una nota fuera de rango (ej. 25).
        // Quita las barras de comentario de la siguiente línea y observa el error al ejecutar:
        // Estudiante estudianteInvalido = new Estudiante("Error", 25);
    }
}