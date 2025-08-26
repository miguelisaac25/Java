package Exercicios.ArrayMultidimensional;

public class ArrayMultidimensional2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        for (int[] arrayBase : arrayInt){
            for (int posi : arrayBase){
                System.out.println(posi);
            }
        }
    }
}
