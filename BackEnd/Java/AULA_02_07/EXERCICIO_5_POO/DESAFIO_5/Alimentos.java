package AULA_02_07.EXERCICIO_5_POO.DESAFIO_5;

public class Alimentos extends Produto implements AplicarDesconto, CalcularFrete {
    private String dataValidade;

    public Alimentos(String nome, double preco, int quantidadeEmEstoque, String dataValidade) {
        super(nome, preco, quantidadeEmEstoque, TipoProduto.ALIMENTOS);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
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
    public double calcularFrete(double peso) {
        return peso * 5.0; // Exemplo: 5 unidades de moeda por kg
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Alimento: " + getNome() + ", Preço: " + getPreco() + ", Quantidade em Estoque: " + getQuantidadeEmEstoque() + ", Data de Validade: " + dataValidade);
    }
}
