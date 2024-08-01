// 1. Soma dos Elementos Pares:
//    Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.

package AULA_27_06.EXERCICIO_3_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class atv_01 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int soma = 0;

        for( int numeros : listaNumeros){
            if(numeros % 2 == 0){
                soma += numeros;
            }
        }

        System.out.println("A soma dos números pares é: " + soma);
    }
}
