// 4. Escreva um programa que imprime os fatores de um número fornecido pelo usuário.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número qualquer: ");
        numero = sc.nextInt();

        System.out.print("Os Fatores do número " + numero + " é: ");
        for (int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
