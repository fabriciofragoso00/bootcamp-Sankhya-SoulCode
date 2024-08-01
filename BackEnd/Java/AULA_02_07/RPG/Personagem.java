package AULA_02_07.RPG;

public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private TipoPersonagem tipo;

    public Personagem(String nome, int nivel, int vida, TipoPersonagem tipo) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
    }

    public void atacar() {
        System.out.println(nome + " atacou!");
    }

    public void defender() {
        System.out.println(nome + " defendeu!");
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }
}
