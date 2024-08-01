package AULA_02_07.EXERCICIO_5_POO.DESAFIO_5;

public class Roupas extends Produto implements AplicarDesconto {
    private String tamanho;

    public Roupas(String nome, double preco, int quantidadeEmEstoque, String tamanho) {
        super(nome, preco, quantidadeEmEstoque, TipoProduto.ROUPAS);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public double calcularValorTotalEstoque() {
        return getPreco() * getQuantidadeEmEstoque();
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return getPreco() - (getPreco() * percentualDesconto / 100);
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Roupa: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em Estoque: " + getQuantidadeEmEstoque() + ", Tamanho: " + tamanho);
    }
}
