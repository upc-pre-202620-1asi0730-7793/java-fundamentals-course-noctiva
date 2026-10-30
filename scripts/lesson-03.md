# Lección 3 — Operadores y expresiones (6 minutos)

**Objetivo:** realizar cálculos y comparaciones en Java utilizando notas escolares.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–00:12:** Portada «Lección 3: Operadores y expresiones».
- **00:12–00:57:** Preguntar cómo se calcula el promedio de 12, 16 y 20; explicar que se suman las notas y se divide entre 3.
- **00:57–01:57:** Presentar suma (`+`), resta (`-`), multiplicación (`*`) y división (`/`); utilizar ejemplos con 8 y 4.
- **01:57–02:37:** Comparar `16 > 13` (verdadero) y `10 == 13` (falso). Distinguir asignación `=` de igualdad `==`.
- **02:37–03:00:** Relacionar cálculo de promedio, comparación con 13 y posterior toma de decisiones.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-03/Demo.java` (en el editor, usar `public class Main`).

1. Crear la clase `Main` y el método `main`.
2. Declarar `nota1 = 12`, `nota2 = 16`, `nota3 = 20`.
3. Calcular `double promedio = (nota1 + nota2 + nota3) / 3.0;` y explicar la división decimal.
4. Comparar `boolean alcanzaMeta = promedio >= 13;`.
5. Mostrar ambos valores usando `System.out.println` y ejecutar.

**Salida esperada:**

```text
Promedio: 16.0
Alcanza 13: true
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** calcular el promedio de 14, 16 y 18 y comprobar si es mayor que 15. Invitar a pausar el video y completar `../starter-files/lesson-03/Main.java`.

**Salida esperada:**

```text
Promedio: 16.0
Mayor que 15: true
```

**Cierre:** Los operadores aritméticos calculan resultados y los de comparación producen `true` o `false`. En la siguiente lección se usan condiciones para tomar decisiones.
