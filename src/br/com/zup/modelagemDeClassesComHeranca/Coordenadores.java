package br.com.zup.modelagemDeClassesComHeranca;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Colaborador {
    private List<Professor> professoresSupervisionados = new ArrayList<>();

    //Métodos construtores

    public Coordenadores() {

    }

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    //método pra adicionar o professor na lista
    public void adicionaProfessor(Professor professorSupervisionado) {
        professoresSupervisionados.add(professorSupervisionado);
    }
}
