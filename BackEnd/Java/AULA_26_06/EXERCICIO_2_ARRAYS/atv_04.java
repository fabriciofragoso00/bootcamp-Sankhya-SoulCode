// 4. Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.

package AULA_26_06.EXERCICIO_2_ARRAYS;

public class atv_04 {
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int pesquisar = 5;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == pesquisar){
                    System.out.println("Elemento encontrado na posição: (" + i + ", " + j + ")");
                }
            }
        } 
    }
}
