package br.com.zup.herancaExercicioClasses2;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String identificador;
    private String endereco;
    private double aluguel;
    private String funcionarioResponsavel;
    List<Morador> moradores = new ArrayList<>();

    //Métodos construtores

    public Imovel() {

    }

    public Imovel(String identificador, String endereco, double aluguel, String funcionarioResponsavel) {
        this.identificador = identificador;
        this.endereco = endereco;
        this.aluguel = aluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    //Getters e Setters

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    //Métodos
    //Para inserir um morador na lista de moradores
    public void inserirMorador(Morador novoMorador) {
        moradores.add(novoMorador);
    }
    //exibindo valor do aluguel, endereço, moradores, funcionário responsável
}
