package AULA_24_06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ifelse {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt
        
        // Solicita se o usuário é amigo do dono
        System.out.print("Você é amigo do dono? (sim/nao): ");
        String amigoDoDonoResposta = scanner.nextLine();
        boolean amigoDoDono = amigoDoDonoResposta.equalsIgnoreCase("sim");
        
        // Solicita se o usuário possui voucher
        System.out.print("Você possui um voucher? (sim/nao): ");
        String voucherResposta = scanner.nextLine();
        boolean voucher = voucherResposta.equalsIgnoreCase("sim");
        
        // Verifica as condições de entrada
        // if (idade >= 18) {
        //     System.out.println("Pode entrar na festa.");
        // } else if (amigoDoDono) {
        //     System.out.println("Pode entrar na festa.");
        // } else if (voucher) {
        //     System.out.println("Pode entrar na festa.");
        // } else {
        //     System.out.println("Acesso não autorizado.");
        // }

        // if (idade >= 18 && (amigoDoDono || voucher)) {
        //     System.out.println("Pode entrar na festa.");
        // } else if (amigoDoDono && voucher) {
        //     System.out.println("Pode entrar na festa.");
        // } else {
        //     System.out.println("Acesso não autorizado.");
        // }

        // Verifica as condições de entrada usando operador ternário
        // String resultado = (idade >= 18 && (amigoDoDono || voucher)) || (amigoDoDono && voucher) ? "Pode entrar na festa." : "Acesso não autorizado.";

 // Contador de condições satisfeitas
 int condicoesSatisfeitas = 0;
        
 // Verifica cada condição e incrementa o contador
 if (idade >= 18) {
     condicoesSatisfeitas++;
 }
 if (amigoDoDono) {
     condicoesSatisfeitas++;
 }
 if (voucher) {
     condicoesSatisfeitas++;
 }
 
 // Verifica as condições de entrada usando switch
 String resultado;
 switch (condicoesSatisfeitas) {
     case 2:
     case 3:
         resultado = "Pode entrar na festa.";
         break;
     default:
         resultado = "Acesso não autorizado.";
         break;
 }

        // Imprime o resultado
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
        scanner.close();
    }
    
}
