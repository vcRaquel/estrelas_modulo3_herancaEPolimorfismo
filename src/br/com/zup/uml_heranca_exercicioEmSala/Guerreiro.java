package br.com.zup.uml_heranca_exercicioEmSala;

public class Guerreiro extends Heroi{
    private double poderAtaque;

    //Métodos construtores

    public Guerreiro() {

    }

    public Guerreiro(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    //Getters e Setters

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    //Métodos
    public double aplicarDano(){
        return poderAtaque;
    }
}
