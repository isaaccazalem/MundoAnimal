package mx.com.animales;

public class Perro extends Animal implements Movible{



    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void Mostrarinfo() {
        super.Mostrarinfo();
    }

    @Override
    public void emitirSonido(){
        System.out.println("guau guau ");
    }

    @Override
    public void moverse() {
        System.out.println("el perro se arrastra sigiloso cual perro de caceria");
    }

    @Override
    public void correr() {
        System.out.println("el perro va corriendo a casa");
    }

    @Override
    public void saltar() {
        System.out.println("el perro salta al ver a su dueño");
    }
}
