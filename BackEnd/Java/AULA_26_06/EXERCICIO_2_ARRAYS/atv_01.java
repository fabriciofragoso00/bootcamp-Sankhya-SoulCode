// 1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).

package AULA_26_06.EXERCICIO_2_ARRAYS;

import java.util.Arrays;

public class atv_01 {
    public static void main(String[] args) {
        
        int [] numeros = {5, 6, 3, 1, 10, 2};
        int aux = 0;

        System.out.println("Array Desordenado: " + Arrays.toString(numeros));

        for(int i = 0; i < numeros.length; i++){
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[i] > numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;  
                }
            }
        }

        System.out.println("Array Ordenado: " + Arrays.toString(numeros));
    }
    
}
