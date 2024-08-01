// 7. Escreva um programa que conta o número de vogais em uma frase fornecida pelo usuário.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase;
        char letra;
        int contVogais = 0;

        System.out.println("Digite uma frase:");
        frase = sc.nextLine();

        for(int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);

            if(letra == 'a' || letra == 'A'){
                contVogais++;
            }else if(letra == 'e' || letra == 'E'){
                contVogais++;
            }else if(letra == 'i' || letra == 'I'){
                contVogais++;
            }else if(letra == 'o' || letra == 'O'){
                contVogais++;
            }else if(letra == 'u' || letra == 'U'){
                contVogais++;
            }
        }
        System.out.println("O número de vogais na frase é: " + contVogais);
        
        sc.close();
    }
}
