package herencia;

public class MainVeterinaria {
    public static void main (String[] args) {
        Perro firulais = new Perro("firulais", 10);
        Gato mirringo = new Gato("mirringo", 5);
        Pajaro blue = new Pajaro("blue", 3);

        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();
        System.out.println("----");
        mirringo.comer();
        mirringo.dormir();
        mirringo.hacerSonido();
        mirringo.ronronear();
        System.out.println("----");
        blue.comer();
        blue.dormir();
        blue.volar();
        blue.silbar();
        System.out.println("----");
    }
}