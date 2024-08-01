package AULA_02_07.EXERCICIO_5_POO.DESAFIO_1;

public abstract class Refeicao {
    private String nome;
    private double preco;
    private TiposDeRefeicoes tipo;

    public Refeicao(String nome, double preco, TiposDeRefeicoes tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public TiposDeRefeicoes getTipo(){
        return tipo;
    }

    public abstract double calcularValorTotal();
    public abstract void imprimirInformacoes();
}
