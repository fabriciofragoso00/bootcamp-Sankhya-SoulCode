// 3. Escreva um programa que imprime os números de 1 a 100. Mas, para múltiplos de 3, imprima "Fizz" em vez do número, e para múltiplos de 5, imprima "Buzz". Para números que são múltiplos de ambos (3 e 5), imprima "FizzBuzz".

package AULA_25_06.EXERCICIO_01;

public class atv_03 {
    public static void main(String[] args) {
        
        for(int i = 1; i <=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println( i + " FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println(i + " Fizz");
            }else if( i % 5 == 0 && i % 5 == 0){
                System.out.println(i + " Buzz");
            }
        }
    }
}
