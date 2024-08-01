package AULA_02_07.RPG;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thor", 10, 150, 30);
        Mago mago = new Mago("Merlin", 8, 100, 50);
        Arqueiro arqueiro = new Arqueiro("Legolas", 9, 120, 40);

        guerreiro.atacar();
        guerreiro.usarHabilidadeEspecial();
        System.out.println("Força: " + guerreiro.getForca());

        mago.atacar();
        mago.usarHabilidadeEspecial();
        System.out.println("Mana: " + mago.getMana());

        arqueiro.atacar();
        arqueiro.usarHabilidadeEspecial();
        System.out.println("Precisão: " + arqueiro.getPrecisao());

        // Polimorfismo usando a interface
        HabilidadeEspecial[] habilidades = {guerreiro, mago, arqueiro};
        for (HabilidadeEspecial habilidade : habilidades) {
            habilidade.usarHabilidadeEspecial();
        }

        // Polimorfismo usando a classe base
        Personagem[] personagens = {guerreiro, mago, arqueiro};
        for (Personagem personagem : personagens) {
            System.out.println(personagem.getNome() + " do tipo " + personagem.getTipo());
            personagem.atacar();
        }
    }
}
