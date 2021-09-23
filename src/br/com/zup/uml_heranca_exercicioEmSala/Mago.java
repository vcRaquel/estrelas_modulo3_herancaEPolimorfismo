package br.com.zup.uml_heranca_exercicioEmSala;

public class Mago extends Heroi{
    private double poderMagico;

    //Métodos construtores

    public Mago() {

    }

    public Mago(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    //Getter e Setters

    public double getPoderMagico() {
        return poderMagico;
    }
    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    //Métodos
    public double aplicarMagia(){
        return poderMagico;
    }
}
