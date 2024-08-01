package AULA_02_07.EXERCICIO_5_POO.DESAFIO_3;

public class Livros extends ItemBiblioteca implements Emprestimo, Devolucao {
    private Genero genero;

    public Livros(String titulo, String autor, int anoPublicacao, Genero genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 1.0; // Exemplo: 1 unidade de moeda por dia de atraso
    }

    @Override
    public void emprestar() {
        System.out.println("Livro " + getTitulo() + " foi emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("Livro " + getTitulo() + " foi devolvido.");
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Genero: " + genero);
    }
}
