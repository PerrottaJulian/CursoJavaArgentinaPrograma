import java.util.Arrays;

public class Main {
    /*1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
    iteraciones simples y condicionales, genere una clase por ejercicio que posea los
    siguientes métodos:
    a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
    el String
    b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
    mismos y los retorne en un vector de 3
    c. dado un vector de números, y un número X, que sume todos los números > X y
    retorne el resultado*/

    public static void main(String[] args) {
        Lettercount("a", "TE AMO JULIAN PERROTTA");
        Sort3(12.45, 12.47, 10.3333, true);
        double[] arr = new double[]{8, 99.99, 10.01, 2, 3.5, 12, 15.3, 15.7};
        BiggerThanXAdd(arr, 10);
    }

    public static void Lettercount(String letter, String string){

        //No se como comparar chars con strings
        string = string.toLowerCase();
        int c = 0;
        String[] letterlist = new String[string.length()];
        letterlist = string.split("");

        for (int i=0; i <string.length(); i++){
            if (letterlist[i].equals(letter)){c++;}
            }
        System.out.println("Letter: " + letter+"\nCounts: " + c + "\nin: " + string);
    }
     public static void Sort3 (double n1, double n2, double n3, boolean ascendant){
        double[] arr = new double[]{n1,n2,n3};
        if (ascendant){
            Arrays.sort(arr);
        } else{
            Arrays.sort(arr);
            for (int i = 0; i < arr.length/2; i++){
                double temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

     }

    public static void BiggerThanXAdd(double[] arr,double x){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x){
                sum += arr[i];
            }
        }
        System.out.println("Suma: " + sum);

    }

}