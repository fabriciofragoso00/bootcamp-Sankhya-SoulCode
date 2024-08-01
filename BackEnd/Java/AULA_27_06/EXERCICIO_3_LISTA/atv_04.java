// 4. Remoção de Elementos Duplicados:
//    Escreva um método que remova todos os elementos duplicados de uma lista, mantendo apenas a primeira ocorrência de cada elemento.

package AULA_27_06.EXERCICIO_3_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class atv_04 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listaOriginal = new ArrayList<>(Arrays.asList(1,2,2,5,6,6,8,8,9,3));

        ArrayList<Integer> listaNumUnicos = new ArrayList<>();

        System.out.print("Lista original: ");
        System.out.println(listaOriginal);

        for( int numeros : listaOriginal){
            if(!listaNumUnicos.contains(numeros)){
                listaNumUnicos.add(numeros);
            }
        }

        listaOriginal.clear();
        listaOriginal.addAll(listaNumUnicos);

        System.out.print("Lista após remover duplicados: ");
        System.out.println(listaOriginal);

    }
}
