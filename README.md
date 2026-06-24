# Universidad Politecnica Salesiana
# Estructuras no lineales

---

## Nombre:
Sebastian Alvarez

## MATERIA:
Estructura de datos

## FECHA:
22/06/2026

## PROFESOR:
Pablo Torres

## Árbol Binario de Búsqueda en Java

---

## 1. Introducción

Este proyecto presenta la implementación de un **Árbol Binario de Búsqueda (Binary Search Tree - BST)** utilizando Java. Su objetivo es comprender el funcionamiento de esta estructura de datos y aplicar conceptos relacionados con la recursividad y la programación orientada a objetos.

Se desarrollaron dos versiones principales:

- Una implementación genérica mediante `BinaryTree<T extends Comparable<T>>`.
- Una implementación especializada para enteros denominada `IntTree`.

Ambas estructuras permiten insertar elementos de forma ordenada, realizar recorridos y calcular propiedades importantes del árbol como la altura y el peso.

---

## 2. Estructura del Nodo

La clase `Node<T>` representa cada nodo que conforma el árbol.

### Atributos

- `T value`: almacena el valor del nodo.
- `Node<T> left`: referencia al hijo izquierdo.
- `Node<T> right`: referencia al hijo derecho.

### Características

- Implementación genérica.
- Permite construir estructuras recursivas.
- Su función principal es almacenar información y referencias.

### Métodos principales

- Constructor para inicializar el valor.
- Métodos getter y setter.
- Método `toString()` para representar el contenido del nodo.

---

## 3. Árbol Binario Genérico (BinaryTree)

La clase `BinaryTree<T extends Comparable<T>>` implementa un árbol binario de búsqueda capaz de trabajar con distintos tipos de datos comparables.

---

### 3.1 Atributos

- `Node<T> root`: nodo raíz del árbol.

---

### 3.2 Inserción de elementos

El método `add(T value)` permite agregar nuevos elementos respetando las reglas de un BST.

#### Lógica de inserción

- Si el árbol está vacío, el primer elemento se convierte en la raíz.
- Si el valor es menor que el nodo actual, se inserta en el subárbol izquierdo.
- Si el valor es mayor o igual, se inserta en el subárbol derecho.

Las comparaciones se realizan utilizando:

- `compareTo()`

---

### 3.3 Recorridos del árbol

Se implementan los tres recorridos clásicos de un árbol binario.

#### Preorden

Orden:

- Nodo actual.
- Subárbol izquierdo.
- Subárbol derecho.

#### Inorden

Orden:

- Subárbol izquierdo.
- Nodo actual.
- Subárbol derecho.

Este recorrido permite obtener los elementos ordenados de forma ascendente.

#### Postorden

Orden:

- Subárbol izquierdo.
- Subárbol derecho.
- Nodo actual.

---

### 3.4 Altura del árbol

El método `getHeight()` calcula la altura del árbol.

Definición:

- Número máximo de niveles desde la raíz hasta la hoja más profunda.

Implementación:

- Se calcula recursivamente tomando la mayor altura entre el subárbol izquierdo y el derecho.

---

### 3.5 Peso del árbol

El método `getPeso()` determina la cantidad total de nodos presentes en el árbol.

Definición:

- Número total de nodos almacenados.

Implementación:

- Se suman recursivamente todos los nodos de ambos subárboles más el nodo actual.

---

## 4. Árbol Binario de Enteros (IntTree)

La clase `IntTree` es una implementación especializada para trabajar únicamente con números enteros.

---

### 4.1 Características

- No utiliza programación genérica.
- Trabaja exclusivamente con valores de tipo `int`.
- Utiliza operadores relacionales para las comparaciones.
- Mantiene la misma lógica de funcionamiento que el árbol genérico.

---

### 4.2 Inserción

El método `add(int value)` permite agregar nuevos valores enteros.

Reglas:

- Los valores menores se insertan en el subárbol izquierdo.
- Los valores mayores o iguales se insertan en el subárbol derecho.

---

### 4.3 Recorridos

Implementa los mismos recorridos disponibles en la versión genérica:

- Preorden.
- Inorden.
- Postorden.

---

### 4.4 Altura y peso

Los métodos funcionan de forma similar a los implementados en `BinaryTree`.

- `getHeight()`: obtiene la altura máxima del árbol.
- `getPeso()`: devuelve la cantidad total de nodos.

---

## 5. Complejidad

### Inserción

- Caso promedio: O(log n)
- Peor caso (árbol degenerado): O(n)

### Recorridos

- Tiempo de ejecución: O(n)
- Espacio utilizado por la recursión: O(h)

Donde:

- `h` representa la altura del árbol.

---

## 6. Conceptos aplicados

- Estructuras de datos no lineales.
- Árboles binarios de búsqueda (BST).
- Programación genérica en Java.
- Recursividad.
- Interfaz Comparable.
- Análisis básico de complejidad.

---

## 7. Observaciones de diseño

- El árbol implementado no está balanceado.
- No utiliza estructuras AVL ni Red-Black.
- Su rendimiento depende del orden de inserción de los elementos.
- La implementación fue desarrollada con fines académicos.
- Se priorizó la claridad y comprensión del código.

---

## 8. Conclusión
Este proyecto permitió comprender el funcionamiento de los Árboles Binarios de Búsqueda y reforzar conocimientos relacionados con estructuras de datos, recursividad y programación orientada a objetos. Además, sirve como base para el estudio de árboles balanceados y estructuras más avanzadas.
