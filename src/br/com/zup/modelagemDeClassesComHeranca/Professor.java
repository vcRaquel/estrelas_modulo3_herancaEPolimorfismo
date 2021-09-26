package br.com.zup.modelagemDeClassesComHeranca;

import java.sql.Array;
import java.util.Arrays;

public class Professor extends Colaborador {
    private String nivelGraduacao;
    private String disciplina;
    private int quantidadeAlunos;
    private int quantidadeTurmas;
    private Turma turmas[] = new Turma [5];
    private int contador = 0;

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

    //método pra adicionar uma turma na lista
    public void registraTurma(Turma novaturma) {
        this.turmas[contador] = novaturma;
        contador++;
        adicionaTurma();
    }

    public void mostraDados(){
        System.out.println("O nome" + getNome());
        System.out.println("O CPF" + getCpf());
        System.out.println("O n de registro" + getNumeroRegistro());
        System.out.println("O órgão de lotação" + getOrgaoLotacao());
        System.out.println("O salário R$" + getSalario());
        System.out.println("O nível de graduação" + this.nivelGraduacao);
        System.out.println("A disciplina" + this.disciplina);
        System.out.println("A quantidade de alunos" + this.quantidadeAlunos);
        System.out.println("A quantidade de turmas" + this.quantidadeTurmas);
        System.out.println("As turmas" + Arrays.toString(turmas)); // resolver o retorno para que exiba os dados e n a referência
    }
}
