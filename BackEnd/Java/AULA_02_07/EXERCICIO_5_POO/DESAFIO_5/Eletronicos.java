package AULA_02_07.EXERCICIO_5_POO.DESAFIO_5;

public class Eletronicos extends Produto implements AplicarDesconto, CalcularFrete {
    private double peso;

    public Eletronicos(String nome, double preco, int quantidadeEmEstoque, double peso) {
        super(nome, preco, quantidadeEmEstoque, TipoProduto.ELETRONICOS);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularValorTotalEstoque() {
        return getPreco() * getQuantidadeEmEstoque();
    }

    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() - (getPreco() * percentual / 100);
    }

    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0; // Exemplo: 10 unidades de moeda por kg
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Eletrônico: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em Estoque: " + getQuantidadeEmEstoque() + ", Peso: " + getPeso() + " kg");
    }
}
