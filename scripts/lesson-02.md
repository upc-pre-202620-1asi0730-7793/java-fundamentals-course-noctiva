# Lección 2 — Variables y tipos de datos (6 minutos)

**Objetivo:** almacenar, modificar y mostrar datos de un estudiante utilizando variables en Java.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito, sin instalación.

## 00:00–03:00 | Introducción y conceptos (diapositivas)

- **00:00–01:00:** Portada «Lección 2: Variables y tipos de datos». Presentar las variables como cajas etiquetadas (`nombre`, `edad`, `nota`) para guardar información en un sistema escolar.
- **01:00–02:15:** Explicar los cuatro tipos de datos básicos: `String` (textos), `int` (números enteros), `double` (números decimales) y `boolean` (`true` o `false`).
- **02:15–03:00:** Mostrar la sintaxis (`Tipo nombre = valor;`), el uso de comillas solo para textos y la posibilidad de cambiar el valor de una variable durante la ejecución.

## 03:00–05:00 | Demostración en el editor Java online

Escribir progresivamente el programa del archivo `../completed-examples/lesson-02/Demo.java` (en el editor, usar `public class Main`).

1. Declarar `String nombre = "Ana";`, `int edad = 15;`, `double nota = 17.5;` y `boolean matriculado = true;`.
2. Mostrar cada dato en consola combinando texto con variables mediante el operador `+` en `System.out.println`.
3. Ejecutar el programa y observar la salida en consola.
4. Cambiar los valores de `nombre` y `edad` y volver a ejecutar para comprobar la actualización.

**Salida esperada:**

```text
Nombre: Ana
Edad: 15
Nota: 17.5
Matriculado: true
```

## 05:00–06:00 | Práctica y cierre

**Desafío:** crear un perfil escolar declarando `nombre`, `edad`, `grado` y `promedio`, y mostrarlos en consola. Invitar a pausar el video y completar `../starter-files/lesson-02/Main.java`.

**Salida esperada:**

```text
Nombre: Luis
Edad: 14
Grado: Tercero
Promedio: 16.5
```

**Cierre:** Las variables nos ayudan a almacenar y modificar información. En la siguiente lección utilizaremos estos valores para realizar operaciones matemáticas.
