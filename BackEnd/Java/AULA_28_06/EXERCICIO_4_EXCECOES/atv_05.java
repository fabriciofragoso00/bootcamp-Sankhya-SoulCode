// Caso de Uso 5: Operações Matemáticas

// Desenvolva um método que realiza operações matemáticas básicas (adição, subtração, multiplicação e divisão) com base em dois números fornecidos pelo usuário e uma operação especificada. Se a operação não for reconhecida, deve ser lançada uma exceção personalizada `InvalidOperationException`. Se uma divisão por zero for tentada, deve ser lançada uma exceção `ArithmeticException`.

package AULA_28_06.EXERCICIO_4_EXCECOES;

import java.util.Scanner;

public class atv_05 {

    public static void calcularOperacao(double numero1, double numero2, String operacao) throws IllegalArgumentException, ArithmeticException{
        
        double resultado;
        switch(operacao.toLowerCase()){
            case "adicao":
                resultado = numero1 + numero2;
                System.out.println("A " + operacao + " dos números " + numero1 + " e " + numero2 + " é: " + resultado);
                break;
            case "subtracao":
                resultado = numero1 - numero2;
                System.out.println("A " + operacao + " dos números " + numero1 + " e " + numero2 + " é: " + resultado);
                break;
            case "multiplicacao":
                resultado = numero1 * numero2;
                System.out.println("A " + operacao + " dos números " + numero1 + " e " + numero2 + " é: " + resultado);
                break;
            case "divisao":
                if(numero2 == 0){
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                resultado = numero1 / numero2;
                System.out.println("A " + operacao + " dos números " + numero1 + " e " + numero2 + " é: " + resultado);
                break;
            default:
                throw new IllegalArgumentException("Operação não reconhecida: " + operacao);
        }

    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            double numero1;
            double numero2;
            
            String operacao;
        
            System.out.print("Digite o 1º número: ");
            numero1 = sc.nextDouble();

            System.out.print("Digite o 2º número: ");
            numero2 = sc.nextDouble();

            System.out.print("Digite a operação que deseja usar (adicao, subtracao, multiplicacao e divisao): ");
            operacao = sc.next();

            calcularOperacao(numero1, numero2, operacao);

            sc.close();
        }catch(IllegalArgumentException | ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }
}
