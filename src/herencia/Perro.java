package herencia;

public class Perro extends Animal{

    public Perro (String nombreMascota, int edadMascota){
        super(nombreMascota, edadMascota);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombreMascota + " dice: guau guau.");
    }
    public void perseguirCola () {
        System.out.println(nombreMascota + " la mascota persigue su cola.");
    }
}
