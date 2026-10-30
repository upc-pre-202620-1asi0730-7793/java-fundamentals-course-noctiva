# Lección 4 — Condicionales `if`, `else if` y `else` (6 minutos)

**Objetivo:** elegir instrucciones según una condición en Java.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **Portada:** «Lección 4: Condicionales `if-else`».
- **Situación cotidiana:** si la nota alcanza 13, se muestra «Aprobado»; de lo contrario, «Desaprobado». El umbral es una regla del ejercicio.
- **Conceptos:** `if` ejecuta instrucciones cuando la condición es verdadera; `else` ofrece una alternativa; `else if` permite evaluar otra condición.
- **Visualización:** diagrama de dos caminos según `nota >= 13`.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el código de `../completed-examples/lesson-04/Demo.java` (en el editor usar `public class Main`):

1. Crear `Main` y `main`.
2. Declarar `int nota = 16;`.
3. Escribir `if (nota >= 13)` y su mensaje «Aprobado».
4. Agregar `else` y su mensaje «Desaprobado».
5. Ejecutar con `16`, cambiar la nota a `11` y ejecutar nuevamente.

**Resultados:** con `16` se imprime `Aprobado`; con `11`, `Desaprobado`.

## 05:00–06:00 | Práctica y cierre

**Desafío:** completar `../starter-files/lesson-04/Main.java` para clasificar la nota:

| Condición | Mensaje |
| --- | --- |
| `nota >= 18` | `Sobresaliente` |
| `nota >= 13` | `Aprobado` |
| En otro caso | `Desaprobado` |

Probar con `20`, `15`, `10`. Invitar a pausar el video; no mostrar la solución antes de la práctica.

**Cierre:** `if`, `else if` y `else` permiten escoger entre diferentes acciones según las condiciones.
