package AULA_02_07.EXERCICIO_5_POO.DESAFIO_1;

public class Sobremesa extends Refeicao implements Descontos, OfertasEspeciais {

    public Sobremesa(String nome, double preco){
        super(nome, preco, TiposDeRefeicoes.SOBREMESA);
    }

    @Override
    public double calcularValorTotal(){
        return getPreco();
    }
    
    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() - (getPreco() * percentual / 100);
    }

    @Override
    public double aplicarOfertaEspecial() {
        return getPreco() * 0.90; //10%
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println(getTipo() + ": " + getNome() + ", Preço: " + getPreco());
    }
}
