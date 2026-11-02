# Lección 5 — Bucles for y while (6 minutos)

**Objetivo:** automatizar la repetición de instrucciones utilizando bucles for y while.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–00:15:** Portada «Lección 5: Bucles for y while».
- **00:15–01:00:** Plantear el caso de registrar números del 1 al 100 de forma manual frente a la automatización con bucles en programación.
- **01:00–02:00:** Presentar el bucle `for` y sus tres partes: inicialización del contador, condición de parada e incremento.
- **02:00–02:40:** Presentar el bucle `while` y su funcionamiento basado en una condición booleana.
- **02:40–03:00:** Advertir sobre la importancia de actualizar el contador para evitar un bucle infinito.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-05/Demo.java` (en el editor, usar `public class Main`).

1. Crear la clase `Main` y el método `main`.
2. Escribir el bucle `for` iniciando en `int i = 1`, con condición `i <= 5` e incremento `i++`.
3. Imprimir dentro del bloque `"Estudiante " + i`.
4. Declarar el contador `int contador = 1;` fuera del bucle `while`.
5. Escribir `while (contador <= 5)`, mostrar `"Registro " + contador` e incrementar con `contador++;`.
6. Ejecutar el código y comprobar ambas secuencias en la consola.

**Salida esperada:**

```text
Estudiante 1
Estudiante 2
Estudiante 3
Estudiante 4
Estudiante 5
Registro 1
Registro 2
Registro 3
Registro 4
Registro 5
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** registrar diez estudiantes mostrando en pantalla desde `Estudiante 1` hasta `Estudiante 10` utilizando `for` y, como reto adicional, repetirlo con `while`. Invitar a pausar el video y completar `../starter-files/lesson-05/Main.java`.

**Salida esperada:**

```text
Estudiante 1
Estudiante 2
...
Estudiante 10
```

**Cierre:** Los bucles permiten repetir instrucciones sin duplicar código. En la siguiente lección se organizarán acciones mediante métodos y se recibirán datos del usuario con Scanner.
