package AULA_02_07.EXERCICIO_5_POO.DESAFIO_5;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private TipoProduto tipo;

    public Produto(String nome, double preco, int quantidadeEmEstoque, TipoProduto tipo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public abstract double calcularValorTotalEstoque();
    public abstract void imprimirDetalhes();
}
