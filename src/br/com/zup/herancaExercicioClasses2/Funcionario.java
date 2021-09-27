package br.com.zup.herancaExercicioClasses2;

public class Funcionario extends Pessoa{
    private String carteiraTrabalho;
    private String funcao;

    //Métodos construtores
    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String telefone, String carteiraTrabalho, String funcao) {
        super(nome, cpf, telefone);
        this.carteiraTrabalho = carteiraTrabalho;
        this.funcao = funcao;
    }

    //Getters e Setters

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
