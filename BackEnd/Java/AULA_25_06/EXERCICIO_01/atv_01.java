// 1. Escreva um programa que verifica se um número é positivo, negativo ou zero.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite qualquer numero: ");
        numero = sc.nextInt();

        if(numero < 0){
            System.out.println("Número é Negativo!");
        }else if(numero == 0){
            System.out.println("Número é Zero!");
        }else{
            System.out.println("Número é Positivo!");
        }

        sc.close();
    }
}
