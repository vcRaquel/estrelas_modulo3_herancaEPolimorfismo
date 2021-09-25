package br.com.zup.modelagemDeClassesComHeranca;

public class Coordenador extends Colaborador {
    //    private List<Professor> professoresSupervisionados = new ArrayList<>();
    private int quantidadeProfessoresSupervisionados;
    private int contador = 0;
    private Professor[] professoresSupervisionados = new Professor[5];

    //Métodos construtores

    public Coordenador() {

    }

    public Coordenador(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }
    //Getters e Setters


    public int getQuantidadeProfessoresSupervisionados() {
        return quantidadeProfessoresSupervisionados;
    }

    public void setQuantidadeProfessoresSupervisionados(int quantidadeProfessoresSupervisionados) {
        this.quantidadeProfessoresSupervisionados = quantidadeProfessoresSupervisionados;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Professor[] getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    //método pra adicionar o professor na lista
    public void adicionaProfessor(Professor professorSupervisionado) {
        this.professoresSupervisionados[contador] = professorSupervisionado;
        contador++;
        this.quantidadeProfessoresSupervisionados++;
    }
    //aumentoSalario: para os coordenadores o aumento de salário é de 5%.
    @Override
    public void aumentoSalario(){
        double salarioAtualizado = (getSalario() * 0.05) + getSalario();
        setSalario(salarioAtualizado);
    }

}
