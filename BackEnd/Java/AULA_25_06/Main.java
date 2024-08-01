package AULA_25_06;

import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;

public class Main {
    public static int incrementar(int i){
        return ++i;
    }
    public static void main(String[] args) {
        /* ESTRUTURAS DE REPETIÇÃO
        * for loop
        * while loop
        * do-while loop
        * enhanced for loop
        */
        
        // for( int i =0; i<=5; i++){
        //     System.out.println("O valor de i: " + i);
        // }

        // int i;
        // for( i =0; i<=5; i++){
        //     System.out.println("O valor de i: " + i);
        // }

        // for( int i =0; i<=5;){
        //     System.out.println("O valor de i: " + i);
        //     i++;
        // }

        // int i;
        // for(i =0; i<=5;){
        //     System.out.println("O valor de i: " + i);
        //     i++;
        // }

        // for( int i =0; i<=5; System.out.println("O valor de i: " + i), i++);

        // for(int i = 0, j = 0; i <= 5; i++, j=i){
        //     System.out.println("O valor de i: "+ j);
        // } 
        
        // for (int i =0; i<=5; i=incrementar(i)){
        //     System.out.println(i);
        // }

        // A forma mais Moderna e legível de usar o For
        // Funcionalidade do Java Stream API - java 8
        // IntStream

        // IntStream.rangeClosed(0, 5).forEach(
        //     i-> System.out.println("O valor de i: " + i));

        // Gerar uma lista de inteiros de 0 a 5 usando IntStream
        // List<Integer> numeros = IntStream.rangeClosed(0, 5).boxed().collect(Collectors.toList());

        // Iterando sobre a lista e imprimindo valores
        // numeros.forEach(i -> System.out.println("O valor de i: " + i));

        int i = 0;
        while (i<5) {
            System.out.println("O valor de i: " + i);
            i++;
        }

        do {
            System.out.println("O valor de i: " + i);
            i++;
        } while (i<5);

        int [] numeros = {1, 2, 3, 4, 5};
        for (int x : numeros){
            System.out.println("Ovalor de x: " + x);
        }
        
        Arrays.stream(numeros).forEach(x -> {
            System.out.println("O valor de x: " + x);
        });
    }
}
