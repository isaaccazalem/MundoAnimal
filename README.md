# 🐾 Proyecto Java de Animales - Polimorfismo,Herencia,Interfaz en Java

Proyecto de Programación Orientada a Objetos que demuestra el uso de 
**herencia, clases abstractas, interfaces y polimorfismo**.

El programa crea diferentes animales, los guarda en un solo arreglo de
tipo `Animal` y los recorre con un ciclo for-each, sin usar `if/else`.
Cada animal responde con su propio sonido y movimiento.

## 📁 Estructura del proyecto


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
```bash
# Compilar todos los archivos
javac src/mx/com/animales/*.java

# Ejecutar
java -cp src mx.com.animales.Main

--Ejemplo de Salida--

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

