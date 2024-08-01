package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial;

        System.out.print("Digite um número inteiro: ");
        fatorial = sc.nextInt();

        int numero;
        numero = fatorial;
        for(int i = fatorial -1; i >= 1; i--){
            fatorial *= i;    
        }

        System.out.println("Fatorial  do número " + numero + " é: " + fatorial);

        sc.close();
    }
}
