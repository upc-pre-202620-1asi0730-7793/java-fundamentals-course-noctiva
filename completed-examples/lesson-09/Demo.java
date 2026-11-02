// Lección 9: Código utilizado durante la demostración.
// Para ejecutarlo en un editor online que requiere Main, copia el
// contenido en Main.java y cambia "class Demo" por "class Main".
class Demo {
    public static void main(String[] args) {
        // En el video pruebas primero con 3 nombres y luego agregas el 4to.
        String[] nombres = {"Ana", "Luis", "Carlos", "Sofia"};
        
        for (String nombre : nombres) {
            System.out.println(nombre + ": " + nombre.length() + " letras");
        }
    }
}