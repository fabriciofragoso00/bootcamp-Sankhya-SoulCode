package AULA_24_06;

// import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    // CORPO DO CÓDIGO
    // System.out.println("Hello, World!");
    
    // variaveis
    //dois tipos de dados
    /*
     * por valor (tipos primitivos)
     * por referência (obj)
     */

    //  int idade = 20;

    //  int integer = 2147483647;
    //  long inteiroLongo = 214748366456448L;
    //  double flutuanteLongo = 474836645644.5466;
    //  float flutuante = 5435345.67F;
    //  boolean logico = false;
    //  char letra = 'I';
    //  letra = 'G';
    //  integer = 17;
    //  // integer = "Oi";
    //  String nome = "Adriano gosta de chocolate.";

    // int -> Integer -> Inteiro (Numerico Inteiro)
    // long -> Long -> Longo (Numero Inteiro)
    // double -> Double -> Dobro (Numerico Decimal)
    // float -> Float -> Flutuante (Numerico Decimal)
    // boolean -> Boolean (Lógico)
    // char -> Charactere -> Caractere (Numerico/Textual)
    // String -> Sequência ou Cadeia (Textuais)

    // System.out.println(nome);
    // System.out.println(flutuanteLongo);

    // operadores matemáticos

//     int num1 = 2 + 3;
//     int num2 = 3 -1;
//     int num3 = 3 * 2;
//     double num4 = 632/7.0;
//     float num4 = 632 / 7.0;
//     int num5 = 5 % 2;
//     DecimalFormat df = new DecimalFormat("#.#####");
//     System.out.println(df.format(num4));
//     System.out.println(num5);

//     System.out.println(num4);


    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro Nº");
    float x = sc.nextFloat();

    System.out.println("Digite o segundo Nº");
    float y = sc.nextFloat();

    float soma = x + y;

    System.out.printf(" A soma de %.2f e %.2f é %.2f", x, y, soma);

    sc.close();
   }
}