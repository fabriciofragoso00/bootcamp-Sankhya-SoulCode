// 10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente).

package AULA_26_06.EXERCICIO_2_ARRAYS;

public class atv_10 {
    public static void main(String[] args) {
        String [] array = {"gremio", "mundo", "casa"};
        String palavra;

        boolean ePalindromo = false;

        int indexAsc;
        int indexDesc;

        for(int i = 0; i < array.length; i++){
            palavra = array[i];
            
            indexAsc = 0;
            indexDesc = palavra.length() - 1;

            while(indexAsc < indexDesc){
                if(palavra.charAt(indexAsc) == palavra.charAt(indexDesc)){
                    ePalindromo = true;
                }
                indexAsc++;
                indexDesc--;   
            }
        }
        if(ePalindromo == true){
            System.out.println("O array de strings contém palavras que são palíndromos");
        }else{
            System.out.println("O array de strings não contém palavras que são palíndromos");
        }
    }
}
