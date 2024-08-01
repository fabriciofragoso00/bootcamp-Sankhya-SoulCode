// 2. Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado.

package AULA_26_06.EXERCICIO_2_ARRAYS;

import java.util.Arrays;

public class atv_02 {
    public static void main(String[] args) {
        
        int [] arrayA = {1, 3, 5, 7};
        int [] arrayB = {2, 4, 6, 8};
        int [] arrayC = new int [arrayA.length + arrayB.length];
        int k = 0; //Index do arrayC

        int aux;

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[k] = arrayA[i];
            k++;
        }

        for (int j = 0; j < arrayB.length; j++) {
            arrayC[k] = arrayB[j];
            k++;
        }

        System.out.println("ArrayA Ordenado: " + Arrays.toString(arrayA));
        System.out.println("ArrayB Ordenado: " + Arrays.toString(arrayB));
        System.out.println("ArrayA e ArrayB Combinado: " + Arrays.toString(arrayC));

        for(int i = 0; i < arrayC.length; i++){
            for(int j = i + 1; j < arrayC.length; j++){
                if(arrayC[i] > arrayC[j]){
                    aux = arrayC[i];
                    arrayC[i] = arrayC[j];
                    arrayC[j] = aux;  
                }
            }
        }

        System.out.println("ArrayA e ArrayB Combinados e Ordenados: " + Arrays.toString(arrayC));
    }
}
