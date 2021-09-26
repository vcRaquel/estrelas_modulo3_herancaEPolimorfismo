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
    public void aumentoSalario() {
        double salarioAtualizado = (getSalario() * 0.05) + getSalario();
        setSalario(salarioAtualizado);
    }

    //método para mostrar informações da lista professoresSupervisionados
    public void mostraProfessoresSupervisionados() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Professores coordenados pelo(a) Coordenador(a) " + getNome() + " : ");
        System.out.println("---------------------------------------------------------------------------");
        for (int indice = 0; indice < contador; indice++) {
            System.out.println("Nome do professor: " + professoresSupervisionados[indice].getNome());
            System.out.println("CPF: " + professoresSupervisionados[indice].getCpf());
            System.out.println("Número de Registro: " + professoresSupervisionados[indice].getNumeroRegistro());
            System.out.println("Orgao de Lotacao: " + professoresSupervisionados[indice].getOrgaoLotacao());
            System.out.println("Salario: " + professoresSupervisionados[indice].getSalario());
            System.out.println("Nível de Graduacao: " + professoresSupervisionados[indice].getNivelGraduacao());
            System.out.println("Disciplina ministrada: " + professoresSupervisionados[indice].getDisciplina());
            System.out.println("Quantidade de Alunos: " + professoresSupervisionados[indice].getQuantidadeAlunos());
            System.out.println("Quantidade de Turmas: " + professoresSupervisionados[indice].getQuantidadeTurmas());
            //mostrando a lista de turmas de cada professor
            Turma turmas[] = professoresSupervisionados[indice].getTurmas();
            for (int indiceb = 0; indiceb < professoresSupervisionados[indice].getQuantidadeTurmas(); indiceb++) {
                System.out.println("================ TURMA " + (indiceb + 1) + ": ============================");
                System.out.println("O nível da turma é: " + turmas[indiceb].getNivel());
                System.out.println("O identificador da turma é: " + turmas[indiceb].getIdentificadorTurma());
                System.out.println("A quantidade de alunos da turma é: " + turmas[indiceb].getQtdAlunos());
                System.out.println("---------------------------------------------------------------------------");
            }
            System.out.println("---------------------------------------------------------------------------");


        }
    }


}
