//https://glysns.gitbook.io/java-basico/sintaxe/anatomia-das-classes

package AULA_02_07.ABSTRATA;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2022, 25.0);
        Carro carro = new Carro("Toyota", "Corolla", 2021, 5);

        caminhao.imprimirInformacoes();
        System.out.println("Capacidade de Transporte: " + caminhao.calcularCapacidadeDeTransporte() + " toneladas");
        caminhao.realizarManutencao();

        System.out.println();

        carro.imprimirInformacoes();
        System.out.println("Capacidade de Transporte: " + carro.calcularCapacidadeDeTransporte() + " passageiros");
        carro.realizarManutencao();
    }
}

