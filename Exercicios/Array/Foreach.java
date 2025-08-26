package Exercicios.Array;

public class Foreach {
    public static void main(String[] args) {
        int[] numeros2 = { 1, 2, 3, 4, 5, 6, 7 };
       //int[] numeros3 = new int[] { 1, 2, 3, 4, 5 };

        /*
         * for (int i = 0; i < numeros3.length; i++) {
         * System.out.println(numeros3[i]);
         * }
         */

        for (int num : numeros2) {
            System.out.println(num);
        }

    }
}
