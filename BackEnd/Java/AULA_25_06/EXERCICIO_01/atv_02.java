// 2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double numeros;
        double soma = 0;
        double media;

        System.out.print("Digite a quantidade de números que deseja inserir: ");
        quantidade = sc.nextInt();

        for(int i = 1; i <= quantidade; i++){
            System.out.println("Digite o " + i + "º número de " + quantidade + " números: ");
            
            numeros = sc.nextDouble();
            soma += numeros;
        }

        media = soma/quantidade;

        System.out.print("A média dos números fornecidos é: " + media);
        sc.close();
    }
}
