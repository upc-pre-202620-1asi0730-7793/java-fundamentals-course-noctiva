// Lección 7: Clases, objetos y constructores
// Solución del ejercicio: crea los estudiantes Carlos y Lucía y llama a su método presentarse().
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

        Estudiante carlos = new Estudiante("Carlos", 16);
        carlos.presentarse();

        Estudiante lucia = new Estudiante("Lucia", 14);
        lucia.presentarse();
    }
}