package br.com.zup.modelagemDeClassesComHeranca;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Professor extends Colaborador {
    private String nivelGraduacao;
    private String disciplina;
    private int quantidadeAlunos;
    private int quantidadeTurmas = 0;
    private Turma turmas[] = new Turma[5];
    private int contador = 0;

    //Métodos construtores

    public Professor() {

    }

    public Professor(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
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

    public Turma[] getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    //Métodos
    //adicionaTurma: para os professores.
    public void adicionaTurma() {
        this.quantidadeTurmas += 1;
    }

    //método pra adicionar uma turma na lista
    public void registraTurma(Turma novaturma) {
        this.turmas[contador] = novaturma;
        contador++;
        adicionaTurma();
        recalculaNumeroAlunos();
    }

    //método para recalcular a quantidade de Alunos
    public void recalculaNumeroAlunos() {
        int numeroAlunos = 0;
        for (int indice = 0; indice < contador; indice++) {
            numeroAlunos += turmas[indice].getQtdAlunos();
        }
        setQuantidadeAlunos(numeroAlunos);
    }

    public void mostraDados() {
        System.out.println("O Nome do professor(a): " + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("Número de Registro: " + getNumeroRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Nível de graduação: " + this.nivelGraduacao);
        System.out.println("Disciplina ministrada: " + this.disciplina);
        System.out.println("Quantidade de alunos: " + this.quantidadeAlunos);
        System.out.println("Quantidade de turmas: " + this.quantidadeTurmas);

        // resolvendo o retorno para que exiba os dados das turmas n a referência
        for (int indice = 0; indice < contador; indice++) {
            System.out.println("================ TURMA " + (indice + 1) + ": ============================");
            System.out.println("O nível da turma é: " + turmas[indice].getNivel());
            System.out.println("O identificador da turma é: " + turmas[indice].getIdentificadorTurma());
            System.out.println("A quantidade de alunos da turma é: " + turmas[indice].getQtdAlunos());
            System.out.println("------------------------------------------------------------------------");
        }
    }

}
