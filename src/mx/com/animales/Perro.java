package mx.com.animales;

public class Perro extends Animal {

    public Perro() {
        super("Wasaski", 12);
    }

    @Override
    public void Mostrarinfo() {
        super.Mostrarinfo();
    }

    @Override
    public void emitirSonido(){
        System.out.println("guau guau ");
    }

}
