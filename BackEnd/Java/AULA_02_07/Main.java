package AULA_02_07;

public class Main {
    public static void main(String[] args) {
        Veiculo meuVeiculo;

        //Polimorfismo em ação
        meuVeiculo = new Carro();
        meuVeiculo.mover();
        ////Polimorfismo em ação
        meuVeiculo = new Bicicleta();
        meuVeiculo.mover();

        meuVeiculo = new Veiculo();
        meuVeiculo.mover();

        Calculadora calc = new Calculadora();
        System.out.println("A soma: " + calc.somar(12,13,14,15,16));

        DiaDaSemana hoje = DiaDaSemana.TERCA;
        switch(hoje){
            case DOMINGO:
                System.out.println("Hoje é domingo");
                break;
            case TERCA:
                System.out.println("Hoje é Terça-Feira");
                break;
            default:
                System.out.println("Dia Inválido");
        }

        Prioridade status = Prioridade.ALTA;
        System.out.println("Prioridade " + status);
        System.out.println("Nível " + status.getNivel());

    }
}
