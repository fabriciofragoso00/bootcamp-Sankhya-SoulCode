package AULA_27_06;

import java.util.ArrayList;
import java.util.List;

public class Listas02 {
    public static void main(String[] args) {
        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(List.of(1, 2, 3)));
        matriz.add(new ArrayList<>(List.of(4, 5, 6)));
        matriz.add(new ArrayList<>(List.of(7, 8, 9)));

        //Número de linhas
        int numLinhas = matriz.size();
        System.out.println("Número de linhas: " + numLinhas);

        //Somar todos os elementos da matriz
        int soma = 0;
        for(List<Integer> linha : matriz){
            for(int elemento : linha){
                soma+= elemento;
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + soma);
        //Percorrer a matriz e imprimir os valores usando for-each
        for(List<Integer> linha : matriz){
            for(int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        //copiar uma lista para outra
        //Lista Original
        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(2);
        listaOriginal.add(3);

        //Criar uma copia
        List<Integer> listaCopia = new ArrayList<>(listaOriginal);

        System.out.println("Lista Original: " + listaOriginal);
        System.out.println();
        System.out.println("Lista Copia: " + listaCopia);

    }

}


///// ALGORITMO DE ORDENAÇÃO
// import java.util.ArrayList;
// import java.util.List;

// public class BubbleSort {
//     public static void main(String[] args) {
//         // Criar uma lista de números inteiros desordenada
//         List<Integer> numeros = new ArrayList<>();
//         numeros.add(5);
//         numeros.add(2);
//         numeros.add(9);
//         numeros.add(1);
//         numeros.add(7);

//         // Exibir a lista desordenada
//         System.out.println("Lista desordenada: " + numeros);

//         // Ordenar a lista usando Bubble Sort
//         bubbleSort(numeros);

//         // Exibir a lista ordenada
//         System.out.println("Lista ordenada: " + numeros);
//     }

//     // Implementação do Bubble Sort
//     public static void bubbleSort(List<Integer> lista) {
//         int n = lista.size();
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (lista.get(j) > lista.get(j + 1)) {
//                     // Troca os elementos
//                     int temp = lista.get(j);
//                     lista.set(j, lista.get(j + 1));
//                     lista.set(j + 1, temp);
//                 }
//             }
//         }
//     }
// }

// https://youtu.be/YKlDz1J3TSw?si=-Rv4VjU8vFobqM4F
// https://youtu.be/oYmHH1-f_L0?si=lpg9O9-14oUSf1Di
