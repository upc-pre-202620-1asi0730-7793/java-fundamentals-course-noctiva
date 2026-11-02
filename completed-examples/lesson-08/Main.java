// Lección 8: Encapsulación, getters y setters
// Solución del ejercicio: agrega el atributo privado nombre, getters y setters, y modifica el nombre a Lucía.
class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("Edad no valida");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 15);
        estudiante.setNombre("Lucia");
        System.out.println("Nombre actualizado: " + estudiante.getNombre());
    }
}