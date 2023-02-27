public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 15;
        int c = a;
        boolean par = false;
        /* EJ 3
        while (c <= b) {
            if (par == true){
                if (c%2 == 0){
                    System.out.println(c);
                }

            } else {
                if (c%2 != 0){
                    System.out.println(c);
                }

            }
            c++;
        } */

        // EJ 4
        for (c = b; c >= a; c--) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }


    }
}