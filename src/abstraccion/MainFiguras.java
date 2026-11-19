package abstraccion;

public class MainFiguras {
    public static void main (String[] args){
        // Figura f = new Figura("X"); ERROR: no se puede instanciar
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 6);
        Cuadrado cu = new Cuadrado(5);
        Rectangulo r = new Rectangulo(8,7);
        Rombo rom = new Rombo(5,4);
        Pentagono penta = new Pentagono(6,4);
        Hexagono hexa = new Hexagono (10,5);
        Trapecio trape = new Trapecio(5, 5,8);
        Paralelogramo paralelo = new Paralelogramo(5,4);

        c.mostrar();
        t.mostrar();
        cu.mostrar();
        r.mostrar();
        rom.mostrar();
        penta.mostrar();
        hexa.mostrar();
        trape.mostrar();
        paralelo.mostrar();
        System.out.println("---");
    }
}