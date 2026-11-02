// Lección 8: Encapsulación, getters y setters.
// Actividad: agrega el atributo privado nombre, getters y setters,
// actualiza el constructor y cambia el nombre del estudiante a Lucía.

class Estudiante {
    // TODO: Declara el atributo privado nombre (private String nombre;)
    private int edad;

    // TODO: Actualiza el constructor para recibir nombre y edad
    Estudiante(int edad) {
        setEdad(edad);
    }

    // TODO: Crea el getter getNombre() y el setter setNombre(String nuevoNombre)

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
        // TODO: Instancia un estudiante con nombre "Ana" y edad 15
        // TODO: Cambia su nombre a "Lucia" usando setNombre()
        // TODO: Imprime en pantalla el nombre actualizado utilizando getNombre()
    }
}