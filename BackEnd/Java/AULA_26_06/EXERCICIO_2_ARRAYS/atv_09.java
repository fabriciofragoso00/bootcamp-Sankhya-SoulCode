// 9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.

package AULA_26_06.EXERCICIO_2_ARRAYS;

public class atv_09 {
    public static void main(String[] args) {
        int[] array = {3, 4, -5, 1, 3, 3, 1, -4};
        int soma = 0;
        boolean subConjSomaZero = false;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                soma += array[j];

                if(soma == 0){
                    subConjSomaZero = true;
                }
            }
        }

        if(subConjSomaZero == true) {
            System.out.println("Existe um subconjunto não vazio com soma zero.");
        } else {
            System.out.println("Não existe um subconjunto não vazio com soma zero.");
        }
    }
}
