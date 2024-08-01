package AULA_02_07.EXEMPLO;

public class Veiculo {
    private String marca;
    private String modelo;
    private TipoCombustivel combustivel;

    public Veiculo(String marca, String modelo, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public void dirigir() {
        System.out.println("O veículo está sendo dirigido");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public TipoCombustivel getCombustivel(){
        return combustivel;
    }
}
