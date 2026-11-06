package mx.com.animales;

abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    private String  getNombre() {
        return this.nombre;
    }
    private int  getEdad() {
        return this.edad;
    }
    private void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void Mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void emitirSonido(){
        System.out.println("Emitiendo Sonido");
    }


}
