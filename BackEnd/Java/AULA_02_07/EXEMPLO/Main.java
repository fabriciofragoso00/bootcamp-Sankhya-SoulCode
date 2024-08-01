package AULA_02_07.EXEMPLO;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", TipoCombustivel.GASOLINA, 4);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Tipo de Combustível: " + meuCarro.getCombustivel());
        System.out.println("Número de portas: " + meuCarro.getNumeroDePortas());

        meuCarro.dirigir();
        meuCarro.realizarManutencao();
        //Polimorfismo usando a interface
        Manutencao manutCarro = meuCarro;
        manutCarro.realizarManutencao();
    }
}