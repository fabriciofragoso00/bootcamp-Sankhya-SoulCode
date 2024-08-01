package AULA_02_07.EXEMPLO;

public class Carro extends Veiculo implements  Manutencao {
    private int numeroDePortas;

    public Carro(String marca, String modelo, TipoCombustivel combustivel, int numeroDePortas) {
        super(marca, modelo, combustivel); // Chama o construtor da classe base
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void dirigir() {
        System.out.println("O carro está sendo dirigido");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro");
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}
