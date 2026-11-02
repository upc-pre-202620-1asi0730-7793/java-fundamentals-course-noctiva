// Lección 7: Código utilizado durante la demostración.
// Para ejecutarlo en un editor online que requiere Main, copia el
// contenido en Main.java y cambia "class Demo" por "class Main".
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

class Demo {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 15);
        ana.presentarse();
    }
}