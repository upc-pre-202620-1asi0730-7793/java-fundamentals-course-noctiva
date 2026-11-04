// Lección 10: Código utilizado durante la demostración.
// Para ejecutarlo en un editor online que requiere Main, copia el
// contenido en Main.java y cambia "class Demo" por "class Main".
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

class Demo {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 17),
            new Estudiante("Luis", 11),
            new Estudiante("Carlos", 15)
        };
        
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarResultado();
        }
    }
}