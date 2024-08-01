package AULA_02_07.EXERCICIO_5_POO.DESAFIO_2;

public class Analista extends Funcionario implements AvaliacaoDeDesempenho,Treinamento {

    public Analista(String nome, int idade, double salario, Departamentos tipo) {
        super(nome, idade, salario, tipo);
    }

    @Override
    public double calcularBonusAnual() {
        return getSalario() * 0.10;
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println(getNome() + " está avaliando seu próprio desempenho.");
    }

    @Override
    public void realizarTreinamento() {
        System.out.println(getNome() + " está realizando um treinamento.");
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Analista: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: " + getSalario());
        System.out.println("Departamento: " + getTipo());
    }
}
