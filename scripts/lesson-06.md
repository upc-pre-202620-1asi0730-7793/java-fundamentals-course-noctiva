# Lección 6 — Métodos, parámetros y Scanner (6 minutos)

**Objetivo:** organizar código reutilizable mediante métodos con parámetros y leer entradas del usuario usando Scanner.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito con consola interactiva.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–00:15:** Portada «Lección 6: Métodos, parámetros y Scanner».
- **00:15–01:00:** Plantear la necesidad de saludar a distintos estudiantes sin reescribir la misma instrucción múltiples veces.
- **01:00–01:50:** Explicar qué es un método (`void`) y cómo los parámetros actúan como entradas de información personalizada.
- **01:50–02:35:** Presentar la clase `Scanner` para capturar texto del teclado y la necesidad de importar `java.util.Scanner`.
- **02:35–03:00:** Conectar el flujo completo: pedir dato en consola, leerlo con `nextLine()` y enviarlo al método como argumento.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-06/Demo.java` (en el editor, usar `public class Main`).

1. Importar `java.util.Scanner` en la primera línea.
2. Definir el método `static void mostrarBienvenida(String nombre)` y su salida `"Bienvenido, " + nombre`.
3. Dentro de `main`, inicializar `Scanner scanner = new Scanner(System.in);`.
4. Solicitar la entrada con `System.out.print("Ingresa tu nombre: ");` y leer con `scanner.nextLine();`.
5. Invocar `mostrarBienvenida(nombre);` pasando la variable leída y cerrar con `scanner.close();`.
6. Ejecutar, escribir `Ana` en la consola interactiva y verificar la respuesta.

**Salida esperada:**

```text
Ingresa tu nombre: Ana
Bienvenido, Ana
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** crear un segundo método llamado `mostrarDespedida(String nombre)` que muestre `"Hasta luego, " + nombre` y llamarlo después de `mostrarBienvenida`. Invitar a pausar el video y completar `../starter-files/lesson-06/Main.java`.

**Salida esperada:**

```text
Ingresa tu nombre: Ana
Bienvenido, Ana
Hasta luego, Ana
```

**Cierre:** Los métodos organizan tareas reutilizables y Scanner añade interactividad con el teclado. En la siguiente lección se representarán entidades completas mediante clases y objetos.