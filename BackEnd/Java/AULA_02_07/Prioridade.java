package AULA_02_07;

public enum Prioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3);

    private int nivel;
    //Construtor
    Prioridade (int nivel){
        this.nivel = nivel;
    }
    //Método getter
    public int getNivel(){
        return nivel;
    }
}

