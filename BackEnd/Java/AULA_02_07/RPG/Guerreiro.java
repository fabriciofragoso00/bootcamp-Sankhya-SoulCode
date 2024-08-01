package AULA_02_07.RPG;

public class Guerreiro extends Personagem implements HabilidadeEspecial {
    private int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida, TipoPersonagem.GUERREIRO);
        this.forca = forca;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com sua espada!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou Fúria do Guerreiro!");
    }

    public int getForca() {
        return forca;
    }
}

