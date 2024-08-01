package AULA_02_07.EXERCICIO_5_POO.DESAFIO_4;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(40, 60, 2.5);
        Trem trem = new Trem(200, 300, 3.0);
        Metro metro = new Metro(150, 250, 3.5);

        System.out.println("Horario De Funcionamento");
        System.out.println("=============================");

        onibus.definirHorarioFuncionamento("06:00 - 22:00");
        trem.definirHorarioFuncionamento("05:00 - 23:00");
        metro.definirHorarioFuncionamento("04:00 - 00:00");
        
        System.out.println();

        System.out.println("Detalhes");
        System.out.println("=============================");
        onibus.imprimirDetalhes();
        trem.imprimirDetalhes();
        metro.imprimirDetalhes();

        System.out.println();

        System.out.println("Tarifa");
        System.out.println("=============================");
        System.out.println("Tarifa total do Ônibus para 50 passageiros: " + onibus.calcularTarifaTotal(50));
        System.out.println("Tarifa total do Trem para 250 passageiros: " + trem.calcularTarifaTotal(250));
        System.out.println("Tarifa total do Metrô para 200 passageiros: " + metro.calcularTarifaTotal(200));

        System.out.println();

        System.out.println("Manutenção");
        System.out.println("=============================");
        onibus.realizarManutencao();
        trem.realizarManutencao();
        metro.realizarManutencao();
    }
}
