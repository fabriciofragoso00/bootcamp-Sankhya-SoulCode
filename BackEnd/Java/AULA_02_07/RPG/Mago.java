package AULA_02_07.RPG;

public class Mago extends Personagem implements HabilidadeEspecial {
    private int mana;

    public Mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida, TipoPersonagem.MAGO);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lançou uma bola de fogo!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou Explosão Arcana!");
    }

    public int getMana() {
        return mana;
    }
}

