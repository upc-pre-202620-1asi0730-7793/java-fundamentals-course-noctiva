# Lección 7 — Clases, objetos y constructores (4 minutos)

**Objetivo:** estructurar, moldear e instanciar información en Java utilizando la Programación Orientada a Objetos.  
**Público:** estudiantes de 12 a 17 años sin experiencia previa.  
**Herramienta:** editor Java online gratuito (JDoodle), sin instalación.

## 00:00–01:46 | Introducción y conceptos (diapositivas)

- **00:00–00:15:** Portada «Lección 7: Clases, objetos y constructores» e introducción a la Programación Orientada a Objetos.
- **00:15–00:45:** Pregunta inicial: ¿Cómo organizamos a muchos estudiantes? Explicación del problema de crear variables sueltas para cada dato al escalar y necesidad de agrupar atributos y acciones.
- **00:45–01:46:** Explicación de los tres conceptos fundamentales:
    - **Clase:** funciona como un molde que define qué atributos (`nombre`, `edad`) y métodos (`presentarse`) tendrán los estudiantes.
    - **Objeto:** representa una instancia concreta de la clase (por ejemplo: Ana, Carlos o Lucía).
    - **Constructor:** permite inicializar la información de un objeto en el momento en que se crea.

## 01:46–02:57 | Demostración en el editor Java online (JDoodle)

Escribir el programa correspondiente a la demostración de la lección en JDoodle:

1. Crear la clase `Estudiante` y declarar los atributos `String nombre` e `int edad`.
2. Definir el constructor `Estudiante(String nombre, int edad)` y utilizar `this` para asignar los parámetros a los atributos.
3. Crear el método `presentarse()` que imprime en consola `"Soy " + nombre + " y tengo " + edad + " anios."`.
4. Dentro de la clase `Main`, instanciar al objeto `Estudiante ana = new Estudiante("Ana", 15);` con la palabra clave `new` y llamar a `ana.presentarse();`.
5. Presionar el botón **Execute** y comprobar el resultado en la consola.

**Salida esperada:**

```text
Soy Ana y tengo 15 anios.
```

## 02:57–04:11 | Práctica y cierre

**Desafío:** instanciar a Carlos (16 años) y a Lucía (14 años) utilizando la clase `Estudiante` e invocar el método `presentarse()` de cada uno. Invitar a pausar el video y completar el ejercicio en JDoodle.

**Salida esperada:**

```text
Soy Ana y tengo 15 anios.
Soy Carlos y tengo 16 anios.
Soy Lucia y tengo 14 anios.
```

**Cierre:** Las clases definen el molde con atributos y métodos, los objetos son instancias creadas con `new`, y los constructores inicializan los datos. En la siguiente lección aprenderemos a proteger la información con encapsulación, getters y setters.