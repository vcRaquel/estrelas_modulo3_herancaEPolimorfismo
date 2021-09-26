package br.com.zup.modelagemDeClassesComHeranca;

public class Turma {
    private int qtdAlunos;
    private String nivel;
    private String identificadorTurma;

    //Métodos Construtores
    public Turma() {

    }
    public Turma(int qtdAlunos, String nivel, String identificadorTurma) {
        this.qtdAlunos = qtdAlunos;
        this.nivel = nivel;
        this.identificadorTurma = identificadorTurma;
    }

    //Getters e Setters

    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getIdentificadorTurma() {
        return identificadorTurma;
    }
    public void setIdentificadorTurma(String identificadorTurma) {
        this.identificadorTurma = identificadorTurma;
    }
}
