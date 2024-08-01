package AULA_02_07.EXERCICIO_5_POO.DESAFIO_2;

public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Ana", 45, 10000.0, Departamentos.MARKETING);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 30, 6000.0, Departamentos.TI);
        Analista analista = new Analista("Mariana", 25, 4000.0, Departamentos.RH);

        gerente.imprimirDetalhes();
        System.out.println("===========================");
        desenvolvedor.imprimirDetalhes();
        System.out.println("===========================");
        analista.imprimirDetalhes();
        System.out.println("===========================");

        System.out.println("Bônus Anual do Gerente: " + gerente.calcularBonusAnual());
        System.out.println("Bônus Anual do Desenvolvedor: " + desenvolvedor.calcularBonusAnual());
        System.out.println("Bônus Anual do Analista: " + analista.calcularBonusAnual());
        System.out.println("===========================");

        gerente.avaliarDesempenho();
        gerente.realizarTreinamento();
        System.out.println("===========================");

        desenvolvedor.avaliarDesempenho();
        System.out.println("===========================");

        analista.realizarTreinamento();
        System.out.println("===========================");
    }
}
