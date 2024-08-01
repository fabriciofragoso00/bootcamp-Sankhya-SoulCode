package AULA_27_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listas {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Anajara");
        alunos.add("Pedro");
        alunos.add(0,"Sebastião");
        alunos.add( "Lucas");
        System.out.println(alunos);

        alunos.remove(0);
        System.out.println(alunos);
        // String valor = alunos.get(0);

        //Adicionando varios alunos addAll()
        List<String> novosAlunos = Arrays.asList("Thiago", "Luciana", "Douglas");

        alunos.addAll(novosAlunos);
        System.out.println(alunos);

        // ArrayList<Integer> lista = new ArrayList<>(10);

        //Imprimir os indices e os elementos da lista
        System.out.println("Índices e elementos da lista");
        for(int i = 0; i<alunos.size(); i++){
            System.out.println("Índice " + i + ": " + alunos.get(i));
        }

        //Criando um mapa para armazenar pares de indices original e elemento
        Map<Integer,String> indiceElementoOriginal = new HashMap<>();

        //Preenchendo o mapa com os índices e elementos originais
        for(int i =0; i <alunos.size(); i++){
            indiceElementoOriginal.put(i, alunos.get(i));
        }
        //Ordenando a lista de alunos em ordem alfabética
        Collections.sort(alunos);
        //Imprimindo a lista de alunos ordenada
        System.out.println("Lista de alunos ordenada");
        for(String aluno : alunos){
            //Obter o indice original do aluno
            int indiceOriginal = getKeyFromValue(indiceElementoOriginal, aluno);
            System.out.println("Índice " + indiceOriginal + ": " + aluno);
        }
    }
    //Método para auxliar para o obter a chave (indice original) a partir de um valor (elemento aluno) dentro da lista alunos
    public static <K, V> K getKeyFromValue(Map<K, V> map, V value){
        for (Map.Entry<K, V> entry : map.entrySet()){
            if(entry.getValue().equals(value)){
                return entry.getKey();
            }
        }
        return null;
    }

    // public static Integer getKeyFromValue(Map<Integer, String> mapa, String value) {
    //     for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
    //         if (entrada.getValue().equals(value)) {
    //             return entrada.getKey();
    //         }
    //     }
    //     return null;
    // }

    public static Integer getKeyFromValue(Map<Integer, String> mapa, String value) {
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            if (entrada.getValue().equals(value)) {
                return entrada.getKey();
            }
        }
        return null;
    }
}

