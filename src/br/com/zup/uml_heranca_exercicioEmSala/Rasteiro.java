package br.com.zup.uml_heranca_exercicioEmSala;

public class Rasteiro extends Inimigo{
    private double danoEspinhos;

    //Métodos construtores

    public Rasteiro() {

    }

    public Rasteiro(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    //Getters e Setters

    public double getDanoEspinhos() {
        return danoEspinhos;
    }
    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    //Métodos
    public double aplicarDano(){
        return danoEspinhos;
    }
}
