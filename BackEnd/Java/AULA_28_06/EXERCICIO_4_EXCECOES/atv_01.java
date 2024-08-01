// Caso de Uso 1: Leitura de Arquivo e Processamento de Dados

// Você precisa ler um arquivo de texto que contém uma lista de números, um em cada linha, e calcular a soma desses números. Se o arquivo não existir, deve ser criada uma exceção personalizada `FileNotFoundException`. Se uma linha não puder ser convertida para um número, deve ser lançada uma exceção personalizada `InvalidNumberFormatException`.

package AULA_28_06.EXERCICIO_4_EXCECOES;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class atv_01 {
    public static void main(String[] args) {
        
        String caminhoDoArquivo = "D:\\FABRICIO\\CursoSankhya\\Java\\AULA_28_06\\EXERCICIO_3_EXCECOES\\atv_01.txt"; //Substitua pelo caminho do seu arquivo

        Scanner sc = null;
        String linha;

        try {
            sc = new Scanner(new File(caminhoDoArquivo));

            int soma = 0;
            int cont = 0;
            
            while(sc.hasNextLine()){
                linha = sc.nextLine();
                try{
                    int numero = Integer.parseInt(linha.trim());
                    soma += numero;
                    cont++;
                }catch(NumberFormatException e) {
                    // TODO: handle exception
                    System.out.println("Erro: A linha não contém um número válido. " + linha);
                    break;
                }
                System.out.println("O " + cont +"º número é: " + linha);
            }
            System.out.println("A soma dos números é: " + soma);
        }catch(FileNotFoundException e){
            // TODO: handle exception
            System.out.println("Erro: Arquivo não encontrado. " + caminhoDoArquivo );
        }finally{
            if(sc != null){
                sc.close();
            }
        }
    }
}
