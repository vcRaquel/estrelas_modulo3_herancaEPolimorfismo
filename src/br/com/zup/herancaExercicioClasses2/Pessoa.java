package br.com.zup.herancaExercicioClasses2;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    //Métodos construtores
    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder imprimePessoa = new StringBuilder();
        imprimePessoa.append("\n O nome do colaborador: " + getNome());
        imprimePessoa.append("\n CPF: " + getCpf());
        imprimePessoa.append("\n Telefone: " + getTelefone());
        imprimePessoa.append("------------------------------------------------------------");

        return imprimePessoa.toString();
    }
}
