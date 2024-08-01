package AULA_25_06.EXERCICIO_01;

import java.util.Scanner;

public class atv_08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        int numeroAux;
        int ultimoDigito;

        String binario = "";
        String binarioInvertido = "";

        System.out.print("Digite um número inteiro qualquer: ");
        numero = sc.nextInt();

        numeroAux = numero;
        while (numero > 0) {
            // System.out.println(numero);
            ultimoDigito= numero % 10;
            // System.out.println(ultimoDigito);
            if(ultimoDigito % 2 == 0){
                binario += "0";
            }else{
                binario += "1";
            }
            // System.out.println(binario);
            // System.out.println("------------------");
            numero = numero/2;
        }

        for(int i = binario.length() - 1; i >= 0; i--){
            binarioInvertido+= binario.charAt(i);
        }

        System.out.println("O número decimal " + numeroAux + " em binário é: " + binarioInvertido);

        sc.close();
    }
}
