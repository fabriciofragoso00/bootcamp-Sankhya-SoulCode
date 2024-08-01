package AULA_01_07;

public class Main {
    public static void main(String[] args) {
        //Criação de um objeto CarroEsportivo
        CarroEsportivo meuCarro = new CarroEsportivo("Ferrari", "Vermelha");
        meuCarro.acelerar(15.0,10.0);
        meuCarro.frear();
        meuCarro.acenderFarol();
        meuCarro.ligarTurbo();

        CarroEsportivo meuCarro2 = new CarroEsportivo();
        System.out.println(meuCarro2.modelo);
        meuCarro.setVelocidade(100.0);
        System.out.println(meuCarro.getVelocidade());
        
    }
}
