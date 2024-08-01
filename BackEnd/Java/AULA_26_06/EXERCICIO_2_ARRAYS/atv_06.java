// 6. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.

package AULA_26_06.EXERCICIO_2_ARRAYS;

public class atv_06 {
    public static void main(String[] args) {
        int[] array = {3, 10, 4, 7, 8, 20, 6, 15};

        int[] sequenciaAtual = new int[array.length]; 
        int[] sequenciaMaisLonga = new int[array.length]; 

        int tamanhoSequenciaAtual = 0; 
        int tamanhoSequenciaLonga = 0; 

        // Percorre o array para encontrar a maior sequência crescente
        for (int i = 0; i < array.length; i++) {
            // Se a sequência atual estiver vazia ou o elemento atual for maior que o último da sequência atual, adicione-o
            if (tamanhoSequenciaAtual == 0 || array[i] > sequenciaAtual[tamanhoSequenciaAtual - 1]) {
                sequenciaAtual[tamanhoSequenciaAtual] = array[i];
                tamanhoSequenciaAtual++;
            } else {
                // Senão, avalie se a sequência atual é maior que a sequência mais longa até agora
                if (tamanhoSequenciaAtual > tamanhoSequenciaLonga) {
                    tamanhoSequenciaLonga = tamanhoSequenciaAtual;
                    System.arraycopy(sequenciaAtual, 0, sequenciaMaisLonga, 0, tamanhoSequenciaAtual);
                }
                // Comece uma nova sequência crescente com o elemento atual
                sequenciaAtual[0] = array[i];
                tamanhoSequenciaAtual = 1;
            }
        }

        // Verifica se a última sequência é a maior
        if (tamanhoSequenciaAtual > tamanhoSequenciaLonga) {
            tamanhoSequenciaLonga = tamanhoSequenciaAtual;
            System.arraycopy(sequenciaAtual, 0, sequenciaMaisLonga, 0, tamanhoSequenciaAtual);
        }

        // Imprime a maior sequência crescente encontrada
        System.out.print("Maior sequência crescente: ");
        for (int i = 0; i < tamanhoSequenciaLonga; i++) {
            System.out.print(sequenciaMaisLonga[i] + " ");
        }
    }    
}

