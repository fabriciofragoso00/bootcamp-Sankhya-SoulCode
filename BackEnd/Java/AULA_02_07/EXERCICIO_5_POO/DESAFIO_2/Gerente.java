package AULA_02_07.EXERCICIO_5_POO.DESAFIO_2;

public class Gerente extends Funcionario implements AvaliacaoDeDesempenho, Treinamento {
    
    public Gerente(String nome, int idade, double salario, Departamentos tipo){
        super(nome, idade, salario, tipo);
    }

    @Override
    public double calcularBonusAnual() {
        return getSalario() * 0.20;
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println(getNome() + " está avaliando o desempenho da equipe.");
    }

    @Override
    public void realizarTreinamento() {
        System.out.println(getNome() + " está monitorando um treinamento.");
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Gerente: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: " + getSalario());
        System.out.println("Departamento: " + getTipo());
    }
}
