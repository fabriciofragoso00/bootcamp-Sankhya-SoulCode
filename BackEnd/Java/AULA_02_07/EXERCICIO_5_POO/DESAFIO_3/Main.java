package AULA_02_07.EXERCICIO_5_POO.DESAFIO_3;

public class Main {
    public static void main(String[] args) {
        Livros livro = new Livros("1984", "George Orwell", 1949, Genero.FICCAO);
        Revistas revista = new Revistas("National Geographic", "Vários Autores", 2023, 101);
        Dvds dvd = new Dvds("Inception", "Christopher Nolan", 2010, 148);

        livro.imprimirDetalhes();
        System.out.println("============================");
        revista.imprimirDetalhes();
        System.out.println("============================");
        dvd.imprimirDetalhes();

        System.out.println();

        livro.emprestar();
        revista.emprestar();
        dvd.emprestar();

        System.out.println();

        livro.devolver();
        revista.devolver();
        dvd.devolver();

        System.out.println();

        System.out.println("Multa por atraso no livro: " + livro.calcularMultaPorAtraso(5));
        System.out.println("Multa por atraso na revista: " + revista.calcularMultaPorAtraso(3));
        System.out.println("Multa por atraso no DVD: " + dvd.calcularMultaPorAtraso(7));
    }
}
