package br.com.zup.herancaExercicioClasses2;

public class Morador extends Pessoa {
    private String imovel;
    private boolean locatario;

    //Métodos construtores
    public Morador() {

    }
    public Morador(String nome, String cpf, String telefone, String imovel, boolean locatario) {
        super(nome, cpf, telefone);
        this.imovel = imovel;
        this.locatario = locatario;
    }

    //Getters e Setters

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public boolean isLocatario() {
        return locatario;
    }

    public void setLocatario(boolean locatario) {
        this.locatario = locatario;
    }
}
