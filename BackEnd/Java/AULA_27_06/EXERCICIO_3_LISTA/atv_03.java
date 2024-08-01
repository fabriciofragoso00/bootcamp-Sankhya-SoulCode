// 3. Ordenação de Lista de Números:
//    Implemente um algoritmo de ordenação (por exemplo, Bubble Sort) para ordenar uma lista de números inteiros em ordem crescente

package AULA_27_06.EXERCICIO_3_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class atv_03 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(59, 34, 25, 31, 45, 5, 90));
        int aux = 0;
        
        System.out.println("Lista original: " + listaNumeros);

        for (int i = 0; i < listaNumeros.size() - 1; i++) {
            for (int j = 0; j < listaNumeros.size() - 1 - i; j++) {
                if (listaNumeros.get(j) > listaNumeros.get(j + 1)) {
                    // Troca os elementos
                    aux = listaNumeros.get(j);
                    listaNumeros.set(j, listaNumeros.get(j + 1));
                    listaNumeros.set(j + 1, aux);
                }
            }
        }

        System.out.println("Lista ordenada: " + listaNumeros);
    }
}
