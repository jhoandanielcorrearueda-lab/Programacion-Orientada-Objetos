
package herencia;

public class Pajaro extends Animal{
    public Pajaro (String nombreMascota, int edaaMascota) {super (nombreMascota,edaaMascota);}

    public void silbar() {
        System.out.println(nombreMascota + " esta silbando");
    }

    public void volar() {
        System.out.println(nombreMascota + " esta volando");
    }
}
