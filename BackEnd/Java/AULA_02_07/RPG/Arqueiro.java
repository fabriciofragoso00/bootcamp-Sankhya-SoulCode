package AULA_02_07.RPG;

public class Arqueiro extends Personagem implements HabilidadeEspecial {
    private int precisao;

    public Arqueiro(String nome, int nivel, int vida, int precisao) {
        super(nome, nivel, vida, TipoPersonagem.ARQUEIRO);
        this.precisao = precisao;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " disparou uma flecha!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou Chuva de Flechas!");
    }

    public int getPrecisao() {
        return precisao;
    }
}

