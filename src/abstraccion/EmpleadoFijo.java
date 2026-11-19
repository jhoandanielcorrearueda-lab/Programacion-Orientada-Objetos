package abstraccion;

    public class EmpleadoFijo extends Empleado{
    private double SalarioMensual;

    public EmpleadoFijo (String nombre, String documento, double SalarioMensual){
        super (nombre, documento);
        this.SalarioMensual = SalarioMensual;
    }

        @Override
        public double calcularPago() {
            return SalarioMensual;
        }
    }
