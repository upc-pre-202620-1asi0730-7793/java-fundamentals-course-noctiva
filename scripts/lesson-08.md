# Lección 8 — Encapsulación, getters y setters (6 minutos)

**Objetivo:** proteger y controlar el acceso y la modificación de los datos de un objeto en Java.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito (JDoodle), sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–01:00:** Portada «Lección 8: Encapsulación, getters y setters». Explicar el problema de intentar asignar valores no válidos (como una edad negativa) cuando los atributos están desprotegidos.
- **01:00–02:00:** Explicar el principio de encapsulación y el uso del modificador `private` para ocultar los datos y restringir el acceso directo desde clases externas.
- **02:00–03:00:** Definir los métodos **getters** (`getEdad`) para consultar información y **setters** (`setEdad`) para modificar y validar datos de forma segura.

## 03:00–05:00 | Demostración en el editor Java online (JDoodle)

Escribir progresivamente el programa del archivo `../completed-examples/lesson-08/Demo.java` (en el editor online, declarar la clase principal como `public class Main`).

1. Crear la clase `Estudiante` y declarar el atributo `private int edad`.
2. Definir el método getter `int getEdad()` para obtener la edad.
3. Crear el método setter `void setEdad(int nuevaEdad)` con la condición `if (nuevaEdad >= 0)` para validar la edad antes de asignarla.
4. Invocar `setEdad(edad)` dentro del constructor `Estudiante(int edad)`.
5. En la clase `Main`, instanciar al estudiante con 15 años, actualizar su edad a 16 con `setEdad(16)` y mostrar el resultado con `getEdad()`.
6. Intentar asignar una edad no válida (`-5`), ejecutar el programa y comprobar que el sistema rechaza el valor mostrando un mensaje de advertencia.

**Salida esperada:**

```text
Edad: 16
Edad no valida
Edad actual: 16
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** agregar el atributo privado `private String nombre`, crear los métodos `getNombre()` y `setNombre(String nuevoNombre)`, actualizar el constructor y cambiar el nombre del estudiante de "Ana" a "Lucía". Invitar a pausar el video y completar `../starter-files/lesson-08/Main.java`.

**Salida esperada:**

```text
Nombre actualizado: Lucia
```

**Cierre:** Los getters permiten obtener información y los setters permiten modificarla de forma controlada y segura. En la siguiente lección aprenderemos a trabajar con varios estudiantes utilizando arrays.