package AULA_02_07.EXERCICIO_5_POO.DESAFIO_4;

public class Onibus extends Transporte implements Manutencao, HorarioFuncionamento {
    private String horarioFuncionamento;

    public Onibus(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal(int passageiros) {
        return getTarifa() * passageiros;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no Ônibus.");
    }

    @Override
    public void definirHorarioFuncionamento(String horario) {
        this.horarioFuncionamento = horario;
        System.out.println("Horário de funcionamento do Ônibus definido para: " + horario);

    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Ônibus: " + "Número de Assentos: " + getNumeroAssentos() + ", Capacidade: " + getCapacidade() + ", Tarifa: " + getTarifa() + ", Horário de Funcionamento: " + horarioFuncionamento);
    }
}
