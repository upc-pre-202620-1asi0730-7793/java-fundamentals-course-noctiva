# Lección 9 — Arrays y cadenas de texto (6 minutos)

**Objetivo:** almacenar múltiples datos del mismo tipo de forma organizada y medir su longitud.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–00:15:** Portada «Lección 9: Arrays y cadenas de texto».
- **00:15–01:00:** Plantear el problema de necesitar 30 variables para 30 estudiantes. Introducir los arrays como una solución eficiente.
- **01:00–02:00:** Explicar qué es un array utilizando el ejemplo visual de cajas. Detallar que las posiciones (índices) comienzan desde cero.
- **02:00–03:00:** Distinguir entre la propiedad `length` (para conocer la cantidad de elementos en un array) y el método `length()` (para conocer la cantidad de caracteres en un `String`).

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-09/Demo.java` (en el editor, usar `public class Main`).

1. Crear la clase `Main` y el método `main`.
2. Declarar un array de cadenas: `String[] nombres = {"Ana", "Luis", "Carlos"};`.
3. Crear un bucle `for` (tipo for-each) para recorrer todos los elementos del array.
4. Mostrar el nombre y su cantidad de caracteres usando `System.out.println(nombre + ": " + nombre.length() + " letras");`.
5. Ejecutar el programa, luego añadir un nombre adicional a la lista y ejecutar nuevamente para demostrar que el bucle se adapta automáticamente.

**Salida esperada:**

```text
Ana: 3 letras
Luis: 4 letras
Carlos: 6 letras
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** crear un array de `String` con cinco nombres diferentes, recorrerlo con un bucle y mostrar cada nombre junto a su cantidad de caracteres. Invitar a pausar el video y completar `../starter-files/lesson-09/Main.java`.

**Salida esperada:**

```text
Ana: 3 letras
Luis: 4 letras
Carlos: 6 letras
Lucia: 5 letras
Pedro: 5 letras
```

**Cierre:** Los arrays nos permiten almacenar varios valores y los bucles nos facilitan trabajar con ellos rápidamente. En la última lección, combinaremos esto con clases y objetos para terminar el registro escolar.