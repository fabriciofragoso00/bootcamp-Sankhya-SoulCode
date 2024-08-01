package AULA_01_07;

public class CarroEsportivo extends Carro{
    
    //Construtores
    public CarroEsportivo(){
        super();
    }
    public CarroEsportivo(String modelo, String cor){
        super(modelo, cor);
    }
    //Método adicional para carroEsportivo
    public void ligarTurbo(){
        setVelocidade(getVelocidade() * 1.13);
        System.out.println("Turbo ligado!" + getVelocidade() + "km/h");
    }
}
