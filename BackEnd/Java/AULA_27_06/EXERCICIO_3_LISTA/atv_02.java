// 2. Verificação de Palíndromo:
//    Crie um método que verifique se uma lista de caracteres forma um palíndromo. Um palíndromo é uma sequência que se lê da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.

package AULA_27_06.EXERCICIO_3_LISTA;

import java.util.ArrayList;
import java.util.Arrays;

public class atv_02 {
    public static void main(String[] args) {
        
        ArrayList<Character> listaChar = new ArrayList<>(Arrays.asList('a', 'r', 'a', 'r', 'a'));
        
        int esquerda = 0;
        int direita = listaChar.size() - 1;

        boolean ePalindrome = true;

        System.out.println("Lista de caracteres: " + listaChar);

        while(esquerda < direita){
            if (!listaChar.get(esquerda).equals(listaChar.get(direita))) {
                ePalindrome = false;
            }
            esquerda++;
            direita--;
        }
        
        if(ePalindrome == true){
            System.out.println("A lista de caracteres é um palindrome!");
        }else{
            System.out.println("A lista de caracteres não é um palindrome!");
        }


        
    }
}
