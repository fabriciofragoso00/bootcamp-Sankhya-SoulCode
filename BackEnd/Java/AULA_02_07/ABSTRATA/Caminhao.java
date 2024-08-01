package AULA_02_07.ABSTRATA;

public class Caminhao extends Veiculo{
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    // @Override
    // public double calcularCapacidadeDeCarga() {
    //     return capacidadeDeCarga;
    // }
    @Override
    public double calcularCapacidadeDeTransporte() {
        return capacidadeDeCarga;
    }
    @Override
    public void realizarManutencao() {
        System.out.println(getMarca() + " " + getModelo() + " está realizando manutenção de rotina.");
    }
    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeDeCarga + " toneladas");
    }

}



