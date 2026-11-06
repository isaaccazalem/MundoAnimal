package mx.com.animales;

public class Main {
    static void main(String[] args) {

        //Arreglo con mis 3 animalitos
        Animal [] mascotas = new Animal[3];
        mascotas [0] = new Perro ("Bobira", 8);
        mascotas [1] = new Gato ("Neko", 5);
        mascotas [2] = new Vaca ("Lola", 9);

        //recorremos el arreglo con un for-each
        for (Animal a : mascotas) {
            //mostramos informacion y el sonido que hace cada animal,
            a.Mostrarinfo();
            a.emitirSonido(); //misma llamada, diferente comportamiento, polimorfismo.

            //mandamos a traer el metodo que esta implementado en la interfaz y lo integramos a cada
            // objeto segun le corresponda a su contrato.
            Movible move  = (Movible) a;
            move.moverse();
            //esto es solo un print de - para separar o reconocer cada elemento de nuestro array.
            System.out.println("--------------");
        }
    }
}
