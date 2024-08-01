package AULA_02_07.EXERCICIO_5_POO.DESAFIO_4;

public abstract class Transporte {
    private int numeroAssentos;
    private int capacidade;
    private double tarifa;

    public Transporte(int numeroAssentos, int capacidade, double tarifa) {
        this.numeroAssentos = numeroAssentos;
        this.capacidade = capacidade;
        this.tarifa = tarifa;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getTarifa() {
        return tarifa;
    }

    public abstract double calcularTarifaTotal(int passageiros);
    public abstract void imprimirDetalhes();
}
