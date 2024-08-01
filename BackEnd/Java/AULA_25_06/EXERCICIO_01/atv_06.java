package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double numero;
        double maior = 0;

        System.out.print("Digite a quantidade de números que deseja inserir: ");
        quantidade = sc.nextInt();

        for(int i = 1; i <= quantidade; i++){
            System.out.print("Digite o " + i + "º número de " + quantidade + " números: ");

            numero = sc.nextDouble();

            if(numero > maior){
                maior = numero;
            }
        }
        System.out.print("O maior número é: " + maior);

        sc.close();
    }
}
