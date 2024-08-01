// 7. Rotacionar um Array: Crie uma função para rotacionar os elementos de um array para a esquerda ou para a direita por um número específico de posições.

package AULA_26_06.EXERCICIO_2_ARRAYS;

import java.util.Arrays;

public class atv_07 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int posicao = 3;
        String direcao = "esquerda";

        int[] arrayAux = new int[array.length];
    
        System.out.println("Array original: "+ Arrays.toString(array));
        
        // Ajusta as posições para evitar rotações desnecessárias
        posicao = posicao % array.length;
        if(posicao < 0) {
            posicao += array.length;
        }

        // Se a direção for "direita", converte para a rotação equivalente à esquerda
        if(direcao.equalsIgnoreCase("direita")) {
            posicao = array.length - posicao;
        }

        // Rotacionar o array para a esquerda
        if (posicao > 0) {
            // Copiar elementos do array original para um array temporário
            for (int i = 0; i < array.length; i++) {
                arrayAux[i] = array[(i + posicao) % array.length];
            }
            // Copiar o array temporário de volta para o array original
            for (int i = 0; i < array.length; i++) {
                array[i] = arrayAux[i];
            }
        }

        System.out.print("Array após rotação para a " + direcao + " por " + posicao + " posições: ");
        System.out.println(Arrays.toString(array));

    }
}
