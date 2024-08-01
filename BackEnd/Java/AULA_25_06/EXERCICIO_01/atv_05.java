// 5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.

package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int cont = 0;

        System.out.print("Digite qualquer número: ");
        numero = sc.nextInt();

        if(numero == 0 || numero == 1){
            System.out.println(numero + " não é considerado um número primo!");
        }else{
            for(int i = 1; i <= numero; i++){
                if(numero % i == 0)
                    cont++;
            }
            if(cont > 2){
                System.out.println(numero + " não é um número primo!");
            }else{
                System.out.println(numero + " é um número primo!");
            }	 
        }
        sc.close();
    }
}
