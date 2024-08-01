package AULA_02_07.EXERCICIO_5_POO.DESAFIO_4;

public class Metro extends Transporte implements Manutencao, HorarioFuncionamento {
    private String horarioFuncionamento;

    public Metro(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int passageiros) {
        return getTarifa() * passageiros;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no Metrô.");
    }

    @Override
    public void definirHorarioFuncionamento(String horario) {
        this.horarioFuncionamento = horario;
        System.out.println("Horário de funcionamento do Metrô definido para: " + horario);
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Metrô: " + "Número de Assentos: " + getNumeroAssentos() + ", Capacidade: " + getCapacidade() + ", Tarifa: " + getTarifa() + ", Horário de Funcionamento: " + horarioFuncionamento);
    }
}
