package AULA_02_07.EXERCICIO_5_POO.DESAFIO_3;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public abstract double calcularMultaPorAtraso(int diasAtraso);
    public abstract void imprimirDetalhes();
}
