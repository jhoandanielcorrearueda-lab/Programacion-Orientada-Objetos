package abstraccion;

public class Paralelogramo extends Figura{
    private double base;
    private double altura;

    public Paralelogramo (double base, double altura){
        super("Paralelogramo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura);
    }
}
