package AULA_02_07.ABSTRATA;

public class Carro extends Veiculo{
    private int numeroDePassageiros;

    public Carro(String marca, String modelo, int ano, int numeroDePassageiros) {
        super(marca, modelo, ano);
        this.numeroDePassageiros = numeroDePassageiros;
    }

    // @Override
    // public double calcularCapacidadeDeCarga() {
    //     // Para um carro, a capacidade de carga pode ser considerada como o número de passageiros.
    //     return numeroDePassageiros;
    // }
    @Override
    public double calcularCapacidadeDeTransporte() {
        // Para um carro, a capacidade de transporte pode ser considerada como o número de passageiros.
        return numeroDePassageiros;
    }

    @Override
    public void realizarManutencao() {
        System.out.println(getMarca() + " " + getModelo() + " está realizando manutenção de rotina.");
    }
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de Passageiros: " + numeroDePassageiros);
    }
}
