package br.com.zup.gestaoDeRestaurante;

public class Ingrediente {
    private String nomeIngrediente;
    private String quantidadeIngrediente;

    //Método Construtor

    public Ingrediente() {

    }

    public Ingrediente(String nomeIngrediente, String quantidadeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
        this.quantidadeIngrediente = quantidadeIngrediente;
    }
    //Getters e Setters

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public String getPesoEmGramas() {
        return quantidadeIngrediente;
    }

    public void setPesoEmGramas(String pesoEmGramas) {
        this.quantidadeIngrediente = pesoEmGramas;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome do ingrediente: " + nomeIngrediente);
        retorno.append("\n Quantidade do ingrediente: " + quantidadeIngrediente);
        retorno.append("\n ---------------------------------------------- \n");

        return retorno.toString();
    }
}
