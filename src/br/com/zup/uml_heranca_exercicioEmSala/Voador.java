package br.com.zup.uml_heranca_exercicioEmSala;

public class Voador extends Inimigo{
    private double danoTiro;

    //Métodos construtores

    public Voador() {

    }

    public Voador(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    //Getters e Setters

    public double getDanoTiro() {
        return danoTiro;
    }
    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    //Métodos
    public double aplicarDano(){
        return danoTiro;
    }
}
