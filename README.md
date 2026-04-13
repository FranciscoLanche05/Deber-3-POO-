# 📝 Deber 3 - Programación Orientada a Objetos (Java)

Este repositorio contiene una serie de ejercicios prácticos desarrollados en Java para aplicar los pilares de la Programación Orientada a Objetos, con especial enfoque en el **Encapsulamiento**, la protección de datos y la sobrecarga de constructores.

---

## 📦 Actividad 3: Clase Producto
**Objetivo:** Comprender el uso del encapsulamiento básico y la sobrecarga de constructores en Java.

**Requisitos implementados:**
- Creación de la clase `Producto` con atributos privados (`nombre`, `precio`, `stock`).
- Implementación de tres tipos de constructores:
  1. Constructor vacío.
  2. Constructor con parámetros para todos los atributos.
  3. Constructor con valores predeterminados.
- Uso de métodos *getters* y *setters* para acceder de forma segura a los datos desde la clase principal.

---

## 🏫 Ejercicio Propuesto 1: Sistema de Calificaciones de un Estudiante
**Objetivo:** Aplicar validación de datos dentro de los métodos *setters* para prevenir el ingreso de estados ilógicos.

**Requisitos implementados en la clase `Estudiante`:**
- **Atributos privados:** `nombre` (String) y `notaFinal` (double).
- **Constructor:** Recibe únicamente el nombre e inicializa automáticamente la nota en 0.
- **Validación Estricta:** El método `setNotaFinal(double)` incluye una estructura condicional (`if`) que rechaza cualquier calificación menor a 0 o mayor a 10, protegiendo la integridad del sistema.
- **Método de Estado:** Un método `mostrarEstado()` que imprime el nombre, la nota y determina si el alumno está "Aprobado" (nota >= 7) o "Reprobado".

---

## 🎮 Ejercicio Propuesto 2: Salud de un Personaje de Videojuego
**Objetivo:** Simular un entorno dinámico donde los atributos privados interactúan con reglas de negocio estrictas (límites máximos y mínimos).

**Requisitos implementados en la clase `Personaje`:**
- **Atributos privados:** `nombre` (String) y `puntosVida` (int).
- **Constructor:** Recibe el nombre y fija automáticamente los puntos de vida iniciales en el máximo permitido (100).
- **Mecánica de Daño (`recibirDano`):** Resta salud al personaje asegurando que la vida nunca caiga en números negativos (el mínimo es 0).
- **Mecánica de Curación (`curar`):** Suma salud asegurando que nunca sobrepase el límite máximo establecido (tope de 100).
- **Display:** Método `mostrarSalud()` para imprimir el estado actual del héroe tras los eventos de la partida.
