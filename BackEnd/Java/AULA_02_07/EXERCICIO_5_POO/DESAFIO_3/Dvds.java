package AULA_02_07.EXERCICIO_5_POO.DESAFIO_3;

public class Dvds extends ItemBiblioteca implements Emprestimo, Devolucao {
    private int duracao;

    public Dvds(String titulo, String autor, int anoPublicacao, int duracao) {
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 1.5; // Exemplo: 1.5 unidade de moeda por dia de atraso
    }

    @Override
    public void emprestar() {
        System.out.println("DVD " + getTitulo() + " foi emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("DVD " + getTitulo() + " foi devolvido.");
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Duração: " + duracao + " minutos");
    }
}
