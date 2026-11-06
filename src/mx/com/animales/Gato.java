package mx.com.animales;

public class Gato extends Animal implements Movible{

    @Override
    public void moverse() {
        System.out.println("el gato esta caminando");
    }
    @Override
    public void saltar() {
        System.out.println("el gato saltando");
    }
    @Override
    public void correr() {
        System.out.println("el gato correndo");
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void Mostrarinfo() {
        super.Mostrarinfo();
    }

    @Override
    public void emitirSonido(){
        System.out.println("Miauuu");
    }
}
