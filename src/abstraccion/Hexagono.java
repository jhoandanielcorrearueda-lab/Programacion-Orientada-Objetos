package abstraccion;

public class Hexagono extends Figura{
    private double perimetro;
    private double apotema;

    public Hexagono (double perimetro, double apotema){
        super("Hexagono");
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (perimetro * apotema) /2;
    }
}
