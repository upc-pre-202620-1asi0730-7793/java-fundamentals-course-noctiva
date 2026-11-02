# Lección 10 — Proyecto final: Registro de estudiantes (6 minutos)

**Objetivo:** aplicar los conceptos de variables, bucles y programación orientada a objetos para construir un registro escolar.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–00:15:** Portada «Lección 10: Proyecto final: Registro de estudiantes».
- **00:15–01:00:** Resumir brevemente lo aprendido en el curso y plantear la construcción del sistema final de calificaciones.
- **01:00–02:00:** Mostrar la arquitectura del proyecto: una clase `Estudiante` (con atributos privados y constructor) y una clase `Main` (para ejecutar el programa).
- **02:00–03:00:** Explicar la lógica del método `mostrarResultado()`, el cual utilizará `if-else` para evaluar si la nota es mayor o igual a 13 para determinar el estado de aprobación.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-10/Demo.java` (en el editor, usar `public class Main`).

1. Crear la clase `Estudiante` con los atributos privados `nombre` y `nota`.
2. Añadir el constructor, validando mediante un `if` que la nota esté en el rango de 0 a 20 (lanzar `IllegalArgumentException` si no lo está).
3. Escribir el método `mostrarResultado()` con una condición `if-else` (>= 13 es "Aprobado", en caso contrario "Desaprobado").
4. En la clase `Main`, crear un array de tipo `Estudiante[]` e instanciar tres objetos.
5. Utilizar un bucle `for` para recorrer el array y llamar a `estudiante.mostrarResultado()` por cada uno, luego ejecutar.

**Salida esperada:**

```text
Ana: Aprobado
Luis: Desaprobado
Carlos: Aprobado
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** agregar dos estudiantes adicionales al registro comprobando que se muestren los cinco resultados. Como reto extra, intentar introducir una nota fuera del rango (ej. 25) para observar el error. Invitar a pausar el video y completar `../starter-files/lesson-10/Main.java`.

**Salida esperada:**

```text
Ana: Aprobado
Luis: Desaprobado
Carlos: Aprobado
Lucia: Aprobado
Pedro: Desaprobado
```

**Cierre:** Compartir tres buenas prácticas clave: utilizar nombres claros, mantener el código organizado y leer siempre los mensajes de error. Agradecer y felicitar por la culminación del curso introductorio.