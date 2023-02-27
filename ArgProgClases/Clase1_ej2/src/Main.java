public class Main {
    public static void main(String[] args) {
        //Lo mejor seria ingresar los valores por consola
        int ingresos = 400000;
        int vehiculos = 2;
        int inmuebles = 2;
        boolean barco = false;
        boolean aeronave = false;
        boolean act_societario = false;

        boolean ingresos_altos = false;

        if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || barco == true || aeronave == true || act_societario == true) {
            ingresos_altos = true;
        }

        if (ingresos_altos == true) {
            System.out.println("Pertenece a ingresos altos");
        } else {
            System.out.println("No pertenece a ingresos altos");
        }
    }
}