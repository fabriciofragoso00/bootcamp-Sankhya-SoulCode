package AULA_02_07.ABSTRATA;

public abstract class Veiculo implements Transportavel, Manutencao {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    //Método abstrato para calcular capacidade de carga
    // public abstract double calcularCapacidadeDeCarga();
    public abstract double calcularCapacidadeDeTransporte();
    public abstract void realizarManutencao();

    //Imprimir as informaçoes do veiculo (método concreto)
    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
