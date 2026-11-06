package mx.com.animales;

abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
    }
    private String  getNombre() {
        return this.nombre;
    }
    private int  getEdad() {
        return this.edad;
    }
}
