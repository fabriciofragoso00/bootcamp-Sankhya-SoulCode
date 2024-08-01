// 8. Histograma de Frequência: Construa um histograma de frequência a partir de um array de números, mostrando quantas vezes cada número aparece.

package AULA_26_06.EXERCICIO_2_ARRAYS;

public class atv_08 {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 5, 1, 3, 5, 2, 1, 4, 9};

        // Arrays para armazenar números únicos e suas frequências
        int[] numerosUnicos = new int[array.length];
        int[] frequencia = new int[array.length];
        int contNumUnicos = 0;

        // Percorre o array original para construir o histograma
        for (int i = 0; i < array.length; i++) {
            int j;
            // Verifica se o número já está no array de números únicos
            for (j = 0; j < contNumUnicos; j++) {
                if (numerosUnicos[j] == array[i]) {
                    frequencia[j]++;
                    break;
                }
            }

            // Se não encontrou o número no array de números únicos, adiciona-o
            if (j == contNumUnicos) {
                numerosUnicos[contNumUnicos] = array[i];
                frequencia[contNumUnicos] = 1;
                contNumUnicos++;
            }
        }

        // Imprime o histograma de frequência
        System.out.println("Histograma de Frequência:");
        for (int k = 0; k < contNumUnicos; k++) {
            System.out.println(numerosUnicos[k] + ": " + frequencia[k]);
        }
    }
}

