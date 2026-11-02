// Lección 7: Clases, objetos y constructores.
// Actividad: crea los estudiantes Carlos (16 años) y Lucía (14 años)
// y llama al método presentarse() de cada uno.

class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " anios.");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 15);
        ana.presentarse();

        // TODO: Instancia a Carlos (16 años) y Lucía (14 años)
        // y llama al método presentarse() de cada uno.
    }
}