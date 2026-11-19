package encapsulamiento;

public class Main {
    public static void main(String[] args){
        System.out.println("Aplication Running");



        //Instancia
        //cuenta1 -> objeto
        CuentaBancaria cuenta1 = new CuentaBancaria("CUENTA-n12345", "Karoll", 1000000);

        String cuentaTitular = cuenta1.getNumeroCuenta();
        System.out.println("El número de cuenta es: " + cuentaTitular);

        String persona = cuenta1.getTitular();
        System.out.println("El titular de la cuenta es: " + persona);

        double dinero = cuenta1.getSaldo();
        System.out.println("El saldo de la cuenta es: " + dinero);

        cuenta1.depositar(500000);
        System.out.println("Saldo final: $" + cuenta1.getSaldo());

    }
}