package AULA_02_07.EXERCICIO_5_POO.DESAFIO_5;

public class Main {
    public static void main(String[] args) {
        Eletronicos eletronico = new Eletronicos("Smartphone", 1500.0, 10, 3);
        Roupas roupa = new Roupas("Camisa", 100.0, 20, "M");
        Alimentos alimento = new Alimentos("Arroz", 20.0, 50, "2024-12-31");

        eletronico.imprimirDetalhes();
        roupa.imprimirDetalhes();
        alimento.imprimirDetalhes();

        System.out.println();

        System.out.println("Valor total do estoque do Eletrônico: " + eletronico.calcularValorTotalEstoque());
        System.out.println("Valor total do estoque da Roupa: " + roupa.calcularValorTotalEstoque());
        System.out.println("Valor total do estoque do Alimento: " + alimento.calcularValorTotalEstoque());

        System.out.println();

        System.out.println("Preço do Eletrônico com 10% de desconto: " + eletronico.aplicarDesconto(10));
        System.out.println("Preço da Roupa com 15% de desconto: " + roupa.aplicarDesconto(15));
        System.out.println("Preço do Alimento com 5% de desconto: " + alimento.aplicarDesconto(5));

        System.out.println();

        System.out.println("Frete para o Eletrônico: " + eletronico.calcularFrete(eletronico.getPeso()));
        System.out.println("Frete para o Alimento: " + alimento.calcularFrete(6.0));
    }
}
