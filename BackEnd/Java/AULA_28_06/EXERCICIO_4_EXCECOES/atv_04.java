// Caso de Uso 4: Manipulação de Coleções

// Implemente um método que remove um elemento de uma lista de strings com base em um índice fornecido pelo usuário. Se o índice estiver fora dos limites da lista, deve ser lançada uma exceção personalizada `IndexOutOfBoundsException`. O programa deve pedir ao usuário para tentar novamente com um índice válido.

package AULA_28_06.EXERCICIO_4_EXCECOES;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class atv_04 {
    
    public static void removerIndice(List<String> listaString, int indice) throws IndexOutOfBoundsException{

        if(indice < 0 || indice >= listaString.size()){
            int tamanho = listaString.size()-1;
            throw new IndexOutOfBoundsException("Erro: Índice " + indice + " fora dos limites! " + " Tamanho máximo [" + tamanho + "]");
        }
        listaString.remove(indice);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<String> listaString = new ArrayList<>();

        listaString.add("Fabricio");
        listaString.add("Felipe");
        listaString.add("Rafael");
        listaString.add("Thomas");

        int indice;

        while(true){
            System.out.println("Lista de Nomes: " + listaString);

            System.out.print("Digite um índice do elemento que deseja remover: ");
            indice = sc.nextInt();

            try{
                removerIndice(listaString, indice);
                System.out.println("Elemento removido com sucesso");
                System.out.println("Lista de nomes atualizada: " + listaString);
                break;               
            } catch(IndexOutOfBoundsException e){
                // TODO: handle exception
                System.out.println(e.getMessage());
                System.out.println("Tente novamente com um índice válido.");
            }
        }  
        sc.close();
    }
}
