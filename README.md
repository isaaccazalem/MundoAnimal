# 🐾 Sistema de Animales - Polimorfismo en Java

Proyecto de Programación Orientada a Objetos que demuestra el uso de **herencia, clases abstractas, interfaces y polimorfismo**.

El programa crea diferentes animales, los guarda en un solo arreglo de tipo `Animal` y los recorre con un ciclo, sin usar `if/else`. Cada animal responde con su propio sonido y movimiento.

## 📁 Estructura del proyecto

```
src/
└── mx/
    └── com/
        └── animales/
            ├── Animal.java
            ├── Movible.java
            ├── Perro.java
            ├── Gato.java
            ├── Vaca.java
            ├── Caballo.java
            └── Main.java
```

**Clases:**

- **Animal:** Clase abstracta con atributos `nombre` y `edad`, metodos `mostrarInformacion()` y `hacerSonido()` abstracto.
- **Movible:** Interfaz que obliga a implementar `void moverse()`.
- **Perro, Gato, Vaca, Caballo:** Implementan su propio sonido y movimiento.

## ▶️ Instrucciones para ejecutar

### Opcion 1: Desde un IDE (IntelliJ, Eclipse, VS Code)

1. Clona el repositorio o descarga el proyecto.
2. Abre la carpeta del proyecto en tu IDE.
3. Abre el archivo `src/mx/com/animales/Main.java`.
4. Presiona **Run**.

### Opcion 2: Desde terminal

```
javac src/mx/com/animales/*.java
java -cp src mx.com.animales.Main
```

## 💻 Ejemplo de salida

```
Nombre: Wasaski
Edad: 12
Guau guau
El perro corre

Nombre: Michi
Edad: 3
Miau
El gato salta

Nombre: Lola
Edad: 5
Muuu
La vaca camina lento

Nombre: Spirit
Edad: 7
¡Hiiiiii!
El caballo galopa

```

## 🧠 Concepto clave

El arreglo es de tipo `Animal[]`, pero guarda objetos `Perro`, `Gato`, `Vaca` y `Caballo`.

Al recorrerlo con un `for`, Java decide automaticamente que version de `hacerSonido()` y `moverse()` ejecutar segun el objeto real.

Por eso, para agregar un animal nuevo solo se crea su clase y se agrega al arreglo, **sin cambiar la logica del ciclo**.
