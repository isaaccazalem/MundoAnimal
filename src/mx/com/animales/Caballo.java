package mx.com.animales;

public class Caballo extends Animal implements Movible {


    public Caballo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void moverse() {
        System.out.println("Caballo camina al establo");
    }

    @Override
    public void correr() {
        System.out.println("Caballo corre en la acrrera anual");
    }

    @Override
    public void saltar() {
        System.out.println("Caballo salta en la competencia");
    }
    @Override
    public void Mostrarinfo() {
        super.Mostrarinfo();
    }

    @Override
    public void emitirSonido(){
        System.out.println("Relincha");
    }
}
