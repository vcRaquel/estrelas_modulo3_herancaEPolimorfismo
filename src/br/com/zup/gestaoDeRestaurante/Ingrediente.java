package br.com.zup.gestaoDeRestaurante;

public class Ingrediente {
    private String nomeIngrediente;
    private double pesoEmGramas;

    //Método Construtor

    public Ingrediente() {

    }

    public Ingrediente(String nomeIngrediente, double pesoEmGramas) {
        this.nomeIngrediente = nomeIngrediente;
        this.pesoEmGramas = pesoEmGramas;
    }
    //Getters e Setters

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }
    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public double getPesoEmGramas() {
        return pesoEmGramas;
    }
    public void setPesoEmGramas(double pesoEmGramas) {
        this.pesoEmGramas = pesoEmGramas;
    }
}
