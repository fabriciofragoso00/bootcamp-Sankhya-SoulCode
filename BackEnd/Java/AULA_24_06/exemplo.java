package AULA_24_06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt
        
        System.out.print("Você é amigo do dono? (sim/nao): ");
        boolean amigoDoDono = scanner.nextLine().equalsIgnoreCase("sim");
        
        System.out.print("Você possui um voucher? (sim/nao): ");
        boolean voucher = scanner.nextLine().equalsIgnoreCase("sim");
        
        // Contador de condições satisfeitas
        int condicoesSatisfeitas = (idade >= 18 ? 1 : 0) + (amigoDoDono ? 1 : 0) + (voucher ? 1 : 0);

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
        // System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
        // Fecha o Scanner
        scanner.close();
    }
}
