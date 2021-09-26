package br.com.zup.modelagemDeClassesComHeranca;

public class Main {
    public static void main(String[] args) {
        Coordenador coordenador1 = new Coordenador("Larissa","1234567","258774","idiomas",2000);
        Professor professor1 = new Professor("Alan","12365478", "6546", "idiomas",1000, "Superior", "Inglês",50,5);
        coordenador1.adicionaProfessor(professor1);
        Professor professor2 = new Professor("Gui","12365445", "6590", "idiomas",1000, "Superior", "Inglês",50,5);
        coordenador1.adicionaProfessor(professor2);

        System.out.println(coordenador1.getQuantidadeProfessoresSupervisionados());
        System.out.println(coordenador1.getSalario());
        coordenador1.aumentoSalario();
        System.out.println(coordenador1.getSalario());

        Turma turma1 = new Turma(10,"quinto ano","5b");
        professor1.registraTurma(turma1);
        professor1.mostraDados();

        coordenador1.getProfessoresSupervisionados();
    }
}
