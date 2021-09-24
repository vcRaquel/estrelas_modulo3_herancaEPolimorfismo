package br.com.zup.modelagemDeClassesComHeranca;

public class FuncionarioAdministrativo extends Colaborador{
    private String funcaoAdministrativa;
    private String senioridade;

    //Métodos construtores

    public FuncionarioAdministrativo() {

    }

    public FuncionarioAdministrativo(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    //Getters e Setters

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }
    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }
    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

}
