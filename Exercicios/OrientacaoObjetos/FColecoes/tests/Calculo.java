package Exercicios.OrientacaoObjetos.FColecoes.tests;

import java.util.List;
import java.util.ArrayList;

public class Calculo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        nums.add(16);
        nums.add(29);
        nums.add(23);
        nums.add(1126);
        nums.add(324);
        nums.add(51);
        nums.add(20);

        for (int numeros : nums){
            if (numeros % 2 == 0){
                pares.add(numeros);
            } else {
                impares.add(numeros);
            }
        }

        System.out.println(nums);
        System.out.println(pares);
        System.out.println(impares);

    }
}
