// 5. Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.

package AULA_26_06.EXERCICIO_2_ARRAYS;

import java.util.Arrays;

public class atv_05 {
    public static void main(String[] args) {
        
        int [] arrayA = {1, 3, 5, 7};
        int [] arrayB = {2, 4, 7, 8};

        int [] arrayUniao = new int[arrayA.length + arrayB.length];
        int contUniao = 0;

        int[] arrayIntersecao = new int[Math.min(arrayA.length, arrayB.length)];
        int contIntersecao = 0;

        int[] arrayDiferenca = new int[arrayA.length];
        int contDiferenca = 0;

        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));

        for (int i = 0; i < arrayA.length; i++) {
            int j;
            for (j = 0; j < contUniao; j++) {
                if (arrayUniao[j] == arrayA[i]) {
                    break;
                }
            }
            if (j == contUniao) {
                arrayUniao[contUniao] = arrayA[i];
                contUniao++;
            }
        }

        for (int i = 0; i < arrayB.length; i++) {
            int j;
            for (j = 0; j < contUniao; j++) {
                if (arrayUniao[j] == arrayB[i]) {
                    break;
                }
            }
            if (j == contUniao) {
                arrayUniao[contUniao] = arrayB[i];
                contUniao++;
            }
        }

        int[] resultadoUniao = Arrays.copyOf(arrayUniao, contUniao);
        System.out.println("União: " + Arrays.toString(resultadoUniao));

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    int k;
                    for (k = 0; k < contIntersecao; k++) {
                        if (arrayIntersecao[k] == arrayA[i]) {
                            break;
                        }
                    }
                    if (k == contIntersecao) {
                        arrayIntersecao[contIntersecao] = arrayA[i];
                        contIntersecao++;
                    }
                    break;  // Elemento encontrado, não precisa continuar verificando
                }
            }
        }
        int[] resultadoIntersecao = Arrays.copyOf(arrayIntersecao, contIntersecao);
        System.out.println("Interseção: " + Arrays.toString(resultadoIntersecao));

        for (int i = 0; i < arrayA.length; i++) {
            int j;
            for (j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    break;
                }
            }
            // Se o elemento não foi encontrado no arrayB
            if (j == arrayB.length) { 
                int k;
                for (k = 0; k < contDiferenca; k++) {
                    if (arrayDiferenca[k] == arrayA[i]) {
                        break;
                    }
                }
                // Se o elemento não foi encontrado no arrayDiferenca
                if (k == contDiferenca) { 
                    arrayDiferenca[contDiferenca] = arrayA[i];
                    contDiferenca++;
                }
            }
        }
        int[] differenceResult = Arrays.copyOf(arrayDiferenca, contDiferenca);
        System.out.println("Diferença: " + Arrays.toString(differenceResult));
    }
}
