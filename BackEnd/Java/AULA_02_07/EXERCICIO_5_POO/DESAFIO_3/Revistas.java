package AULA_02_07.EXERCICIO_5_POO.DESAFIO_3;

public class Revistas extends ItemBiblioteca implements Emprestimo, Devolucao {

    private int edicao;

    public Revistas(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public double calcularMultaPorAtraso(int diasAtraso) {
        return diasAtraso * 0.5; // Exemplo: 0.5 unidade de moeda por dia de atraso
    }

    @Override
    public void emprestar() {
        System.out.println("Revista " + getTitulo() + " foi emprestada.");
    }

    @Override
    public void devolver() {
        System.out.println("Revista " + getTitulo()+ " foi devolvida.");
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }
}
