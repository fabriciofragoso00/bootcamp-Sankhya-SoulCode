package AULA_02_07.EXERCICIO_5_POO.DESAFIO_2;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private Departamentos tipo;

    public Funcionario(String nome, int idade, double salario, Departamentos tipo){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getSalario(){
        return salario;
    }

    public Departamentos getTipo(){
        return tipo;
    }

    public abstract double calcularBonusAnual();
    public abstract void imprimirDetalhes();

}
