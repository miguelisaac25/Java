package Exercicios.ArrayMultidimensional;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        // primeiro array para os meses
        // segundo array para os dias referente aos meses

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        /*
         * for (int i = 0; 0 < dias.length; i++) {
         * for (int j = 0; j < dias[i].length; j++) {
         * System.out.println(dias[i][j]);
         * }
         * }
         */

        // Você ainda vai criar uma variável com tipo porém declarando que é um array, então a forma fica 
        // for (tipo[] : arrayMultidimensional) que no caso é dias

        // E depois de criar esse for, você vai criar mais um porém agora com o tipo normal mas se referenciando ao for anterior que você criou que no caso é o arrBase, o código fica:
        // for (tipo num : arrBase ou for anterior)


        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }

        }
    }
}
