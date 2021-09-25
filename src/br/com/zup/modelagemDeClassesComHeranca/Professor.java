package br.com.zup.modelagemDeClassesComHeranca;

public class Professor extends Colaborador {
    private String nivelGraduacao;
    private String disciplina;
    private int quantidadeAlunos;
    private int quantidadeTurmas;

    //Métodos construtores

    public Professor() {

    }

    public Professor(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina, int quantidadeAlunos, int quantidadeTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    //Getters e Setters

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }
    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }
    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }

    //Métodos
    //adicionaTurma: para os professores.
    public void adicionaTurma(){
        this.quantidadeTurmas += 1;
    }
}
