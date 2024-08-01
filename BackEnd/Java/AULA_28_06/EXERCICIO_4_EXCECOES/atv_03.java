package AULA_28_06.EXERCICIO_4_EXCECOES;

import java.util.ArrayList;
import java.util.List;

public class atv_03 {
    public static void main(String[] args) {
        
        List<String> listaString = new ArrayList<>();
        List<Integer> listaInteiros = new ArrayList<>();

        listaString.add("123");
        listaString.add("abc");
        listaString.add("456");
        listaString.add("78.9");
        listaString.add("900");

        for(String str : listaString){
            try{
                int inteiro = Integer.parseInt(str);
                listaInteiros.add(inteiro);
            }catch(NumberFormatException e){
                // TODO: handle exception
                try{
                    throw new IllegalArgumentException("Falha ao converter \"" + str + "\" para inteiro.");
                }catch(IllegalArgumentException i){
                    // TODO: handle exception
                    System.out.println(i.getMessage());
                }    
            }
        }
        System.out.println("Lista de inteiros convertidos: " + listaInteiros);
    }
}
