package AULA_02_07.EXERCICIO_5_POO.DESAFIO_1;

public class Main {
    public static void main(String[] args) {
        Entrada entrada = new Entrada("Salada", 15.0);
        PratoPrincipal pratoPrincipal = new PratoPrincipal("Bife Acebolado", 30.0);
        Sobremesa sobremesa = new Sobremesa("Torta Alemã", 13.0);

        entrada.imprimirInformacoes();
        pratoPrincipal.imprimirInformacoes();
        sobremesa.imprimirInformacoes();

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println("Preço com desconto de 15% na entrada: " + entrada.aplicarDesconto(15));
        System.out.println("Preço com oferta especial na entrada: " + entrada.aplicarOfertaEspecial());

        System.out.println();

        System.out.println("Preço com desconto de 20% no prato principal: " + pratoPrincipal.aplicarDesconto(20));
        System.out.println("Preço com oferta especial no prato principal: " + pratoPrincipal.aplicarOfertaEspecial());

        System.out.println();

        System.out.println("Preço com desconto de 5% na sobremesa: " + sobremesa.aplicarDesconto(5));
        System.out.printf("Preço com oferta especial na sobremesa: %.2f", sobremesa.aplicarOfertaEspecial());

    }
}
