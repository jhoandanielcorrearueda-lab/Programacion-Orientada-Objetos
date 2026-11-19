package abstraccion;

public class Trapecio extends Figura {
    private double base_mayor;
    private double base_menor;
    private double altura;

    public Trapecio(double base_mayor, double base_menor, double altura) {
        super("Trapecio");
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base_mayor + base_menor * altura) /2;
    }
}
