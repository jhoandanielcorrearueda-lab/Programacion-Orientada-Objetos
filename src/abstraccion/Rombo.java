package abstraccion;

public class Rombo extends Figura{
    private double diagonal_mayor;
    private double diagonal_menor;

    public Rombo (double diagonal_mayor, double diagonal_menor){
        super("Rombo");
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
    }

    @Override
    public double calcularArea() {
        return (diagonal_mayor * diagonal_menor)/2;
    }
}
