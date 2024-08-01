package AULA_26_06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ARRAYS EM JAVA
        // Unidimensional: vetor

        // int [] a;
        // int [] b = new int[10];
        int [] c = {1, 2, 3, 4, 5};
        // String [] nomes = {"Fabricio", "Felipe"};

        // System.out.println(nomes[0]);
        // nomes[0] = "Luciana";
        // System.out.println(b[9]);

        // for(int i = 0; i<nomes.length; i++){
        //     System.out.println("Elemento " + i + " nome = " + nomes[i]);
        // }

        // System.out.println(Arrays.toString(nomes));
        // System.out.println(Arrays.toString(c));

        // for(int elemento : c){
        //     System.out.println(elemento);
        // }

        // for(String elemento : nomes){
        //     System.out.println(elemento);
        // }

        // for (int elemento : c) {
        //     elemento = elemento * 2;
        //     System.out.println(elemento);
        // }

        double media;
        int soma = 0;
        for (int elemento : c){
            soma += elemento;
        }
        media = (double) soma / c.length;
        System.out.println("A média dos elementos: " + media);

    int [] numeros = {1, 2, 3, 4, 5};
    // Novo elemento a ser adicionado
    int novoElemento = 7;
    //Criar um novo Array com tamanho maior
    int novoTamanho = numeros.length + 1;
    int [] numeros2 = new int[novoTamanho];
    //Copiando os elementos do array Original
    for(int i = 0; i< numeros.length; i++){
        numeros2[i] = numeros[i];
    }
    //Adicionando o novo elemento
    numeros2[novoTamanho - 1] = novoElemento;
    numeros=numeros2;
    //Imprimir
    System.out.println("Novo Array: " + Arrays.toString(numeros2));


    //Elemento a ser removido
    int elementoParaRemover = 3;

    // Criando um novo Array para armazenar
    int [] numeros3 = new int[numeros.length-1];
    int indiceNumeros3 = 0;
    //Copiando os elementos que nao devem ser removidos
    for(int i = 0; i < numeros.length; i++){
        if(numeros[i] != elementoParaRemover){
            numeros3[indiceNumeros3] = numeros[i];
            indiceNumeros3++;
        }
    }
    numeros = numeros3;
    System.out.println("Novo Array: " + Arrays.toString(numeros));


    //Array de Origem
    int [] numerosOrigem = {1,2,3,4,5};
    //Array de Destino
    int [] numerosDestino = new int [5];
    //Copiando
    System.arraycopy(numerosOrigem, 0, numerosDestino, 0, numerosOrigem.length);
    //Imprimindo
    System.out.println(Arrays.toString(numerosDestino));


    //Array Original
    int [] arrayOriginal = {1,2,3,4,5};
    //Copiando
    int[] arrayCopiado = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 3);
    //Imprimindo
    System.out.println("Array copiado: " + Arrays.toString(arrayCopiado));


    // Array de inteiros
    int[] arrayInteiros = {1, 2, 3, 4, 5};
        
    // Array de doubles
    double[] arrayDoubles = new double[arrayInteiros.length];
    
    // Copiando elementos de arrayInteiros para arrayDoubles
    for (int i = 0; i < arrayInteiros.length; i++) {
        arrayDoubles[i] = arrayInteiros[i]; // Conversão automática de int para double
    }
    
    // Imprimindo o array de doubles
    System.out.println("Array de doubles após cópia: " + Arrays.toString(arrayDoubles));

    // Array de inteiros
    int[] arrayInteiros3 = {1, 2, 3, 4, 5};
        
    // Array de strings
    String[] arrayStrings = new String[arrayInteiros3.length];
    
    // Copiando elementos de arrayInteiros para arrayStrings com conversão explícita
    for (int i = 0; i < arrayInteiros3.length; i++) {
        arrayStrings[i] = String.valueOf(arrayInteiros3[i]); // Conversão de int para String
    }
    
    // Imprimindo o array de strings
    System.out.println("Array de strings após cópia: " + Arrays.toString(arrayStrings));



 // Array de strings
    String[] arrayStrings2 = {"10", "20", "30", "40", "50"};
    
    // Array de inteiros
    int[] arrayInteiros2 = new int[arrayStrings2.length];
    
    // Copiando elementos de arrayStrings para arrayInteiros com conversão explícita
    for (int i = 0; i < arrayStrings2.length; i++) {
        arrayInteiros2[i] = Integer.parseInt(arrayStrings2[i]); // Conversão de String para int
    }
    
    // Imprimindo o array de inteiros
    System.out.println("Array de inteiros após cópia: " + Arrays.toString(arrayInteiros2));

    }

    
}
