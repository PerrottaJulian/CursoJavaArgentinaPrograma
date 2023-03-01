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
        Lettercount("a", "te amo julian perrotta");
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
     public static void Sort3 (int n1, int n2, int n3, boolean ascendant){
        int[] numlist = new int[]{n1,n2,n3};
        if (ascendant){
            
        }

     }



}