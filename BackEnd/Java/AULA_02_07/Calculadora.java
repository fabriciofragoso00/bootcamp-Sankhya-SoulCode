package AULA_02_07;

public class Calculadora {
    //Overload
    //Método para adição de dois inteiros
    public int somar(int a, int b){
        return a + b;
    }
    //Método para adição de três inteiros
    public int somar(int a, int b, int c){
        return a + b + c;
    }
    //Método para adição dois números com decimais
    public Double somar(Double a, Double b){
        return a + b;
    }
    //Metodo para adição de arrays de numeros inteiros
    public int somar(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma+= num;
        }
        return soma;
    }
}
