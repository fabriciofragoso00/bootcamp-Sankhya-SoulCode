// 3. Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.

package AULA_26_06.EXERCICIO_2_ARRAYS;

import java.lang.Math;

public class atv_03 {
    public static void main(String[] args) {
        
        int [] array = {3, 6, 10};

        double media;
        double soma = 0;

        double variancia = 0;
        
        for (int i : array){
            soma += i;
        }

        media = soma / array.length;

        for(int i : array){
            variancia += Math.pow(i - media, 2);
        }

        variancia = Math.sqrt(variancia/array.length);

        System.out.printf("Media = %.2f %n",media);
        System.out.printf("Desvio padrão = %.2f %n ", variancia);
    }
}
