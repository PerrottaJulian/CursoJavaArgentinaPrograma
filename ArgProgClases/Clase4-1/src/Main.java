import java.util.Arrays;
import java.util.Scanner;

/*1. Tomando los Ejercicios de la clase anterior
    a. haga un main, donde por parámetro ponga 3 números y una letra que represente ascendente o descendente y los muestre ordenados por tal criterio
    b. haga lo mismo, pero solicitando los parámetros de a uno por consola
    c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
       si no detecta ninguno. Vea si con una función puede evitar repetir código.*/
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Orden ascendente o descendente (a/d): ");
        String a_d = scanner.nextLine();
        while (!a_d.equals("a") && !a_d.equals("d")){
            a_d = scanner.nextLine();
        }
        System.out.println("Primer numero: ");
        double n1 = scanner.nextDouble();
        System.out.println("Segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.println("Tercer numero: ");
        double n3 = scanner.nextDouble();

        Sort3(n1,n2,n3,a_d.charAt(0));




    }

    public static void Sort3 (double n1, double n2, double n3, char a_d) {
        double[] narr = new double[]{n1, n2, n3};
        Arrays.sort(narr);
        if (a_d == 'd'){
            for (int i = 0; i < narr.length/2; i++){
                double temp = narr[i];
                narr[i] = narr[narr.length - 1 - i];
                narr[narr.length - 1 - i] = temp;
            }
        }
        for (double n: narr){
            System.out.println(n);
        }

    }
}