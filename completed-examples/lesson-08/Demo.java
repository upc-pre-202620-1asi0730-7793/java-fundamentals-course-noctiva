// Lección 8: Código utilizado durante la demostración.
// Para ejecutarlo en un editor online que requiere Main, copia el
// contenido en Main.java y cambia "class Demo" por "class Main".
class Estudiante {
    private int edad;

    Estudiante(int edad) {
        setEdad(edad);
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

class Demo {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante(15);
        ana.setEdad(16);
        System.out.println("Edad: " + ana.getEdad());
        ana.setEdad(-5);
        System.out.println("Edad actual: " + ana.getEdad());
    }
}