package encapsulamiento;

public class MainAprendiz {
    public static void main(String[] args){
        Aprendiz a = new Aprendiz("1092533870", "Jhoan Correa");

        a.setEdad(18);
        a.setNotaFinal(4.4);

        System.out.println("Aprendiz" + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota: " + a.getNotaFinal());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}
