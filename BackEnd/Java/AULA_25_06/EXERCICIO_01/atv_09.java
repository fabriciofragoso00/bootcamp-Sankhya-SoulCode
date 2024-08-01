// 9. Escreva um programa que verifica se uma string é um palíndromo.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra;
        String palavraInvertida = "";

        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();
        
        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if(palavra.equals(palavraInvertida)){
            System.out.println("A palavra " + palavra + " é um palindromo");
            System.out.println(palavra + " = " + palavraInvertida);
        }else {
            System.out.println("A palavra " + palavra + " não é um palindromo");
            System.out.println(palavra + " != " + palavraInvertida);
        }

        sc.close();
    }
}
