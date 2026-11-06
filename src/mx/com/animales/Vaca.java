package mx.com.animales;

public class Vaca extends Animal implements Movible{
    @Override
    public void moverse() {
        System.out.println("la vaca va caminando");
    }

    @Override
    public void correr() {
        System.out.println("la vaca corre asustada");
    }

    @Override
    public void saltar() {
        System.out.println("la vaca salta la sanja");
    }

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void Mostrarinfo() {
        super.Mostrarinfo();
    }

    @Override
    public void emitirSonido(){
        System.out.println("muuuuuñequita de hule");
    }

}
