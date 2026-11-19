package abstraccion;

public class Pentagono extends Figura{
    private double perimetro;
    private double apotema;

    public Pentagono (double perimetro, double apotema){
        super("Pentagono");
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (perimetro * apotema) /2;
    }
}
