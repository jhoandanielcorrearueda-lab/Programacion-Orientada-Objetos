package abstraccion;

    public class EmpleadoPorHoras extends Empleado{
        private int horasTrabajadas;
        private double tarifaPorHoras;

        public EmpleadoPorHoras (String nombre, String documento, int horas, double tarifa){
            super(nombre, documento);
            this.horasTrabajadas = horas;
            this.tarifaPorHoras = tarifa;
        }
        public double calcularPago() {
            return horasTrabajadas * tarifaPorHoras;
        }
    }
