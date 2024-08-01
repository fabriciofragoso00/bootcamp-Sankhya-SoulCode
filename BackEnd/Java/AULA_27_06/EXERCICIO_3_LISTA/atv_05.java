// 5. Média de Valores Únicos:
//    Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média.

package AULA_27_06.EXERCICIO_3_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class atv_05 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listaOriginal = new ArrayList<>(Arrays.asList(5,5,7,8,8));

        ArrayList<Integer> listaNumUnicos = new ArrayList<>();
        int soma =0;
        double media;

        for(int numeros : listaOriginal){
            if(!listaNumUnicos.contains(numeros)){
                listaNumUnicos.add(numeros);
            }
        }

        for( int num : listaNumUnicos){
            soma += num;
        }

        media = (double) soma/listaNumUnicos.size();

        System.out.println("Lista Notas Original: " + listaOriginal);
        System.out.println("Lista Notas Unicas: " + listaNumUnicos);
        System.out.printf("Media Notas: %.2f %n", media);

    }
}
