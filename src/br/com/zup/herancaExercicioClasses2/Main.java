//Imobiliária.
// O sistema deve permitir o cadastro de um imóvel e de todos os seus moradores.
// Ao final do programa, deve ser exibido o endereço do imóvel, o valor do aluguel,
// quais são seus moradores e o nome do funcionário responsável pelo imóvel.
//
//
//Entrega Mínima: O sistema permite cadastrar um imóvel com valor do aluguel, endereço,
// os moradores e o funcionário responsável.
// No final, o sistema deve exibir os dados do imóvel.
//
//
//Entrega Máxima: O sistema permite adicionar mais de um imóvel e exibir a lista de imóveis.
package br.com.zup.herancaExercicioClasses2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        int seletor = 1;
//        System.out.println("Bem vindo ao sistema de imobiliária");
//        while (seletor>0 && seletor < 8) {
//            System.out.println("Digite 1 para criar um catálogo");
//            System.out.println("Digite 2 para cadastrar um imóvel");
//            System.out.println("Digite 3 para cadastrar um funcionário");
//            System.out.println("Digite 4 para cadastrar um morador");
//
//            seletor = leitor.nextInt();
//            leitor.nextLine();
//        }
//
//        switch (seletor){
//            case 1:
//                System.out.println("Por favor digite o nome do catálogo");
//                String nomeImovel = leitor.nextLine();
//                Catalogo + nomeImovel = new Catalogo();
//        }

        Morador morador1 = new Morador("Caio", "1236547", "1236547", "Jardim 123", true);
        Morador morador2 = new Morador("José", "1235447", "1236565", "Jardim 123", false);

        Funcionario funcionario1 = new Funcionario("José", "42423565", "983735637", "78968756", "Corretor");
        Imovel imovel1 = new Imovel("Jardim 123", "Jardim das flores 123", 2545.50, funcionario1);
        Imovel imovel2 = new Imovel("Jardim 300", "Jardim das flores 300", 2545.50, funcionario1);
        Catalogo catalogo1 = new Catalogo();
        catalogo1.adicionaImovelNoCatalogo(imovel1);
        catalogo1.adicionaImovelNoCatalogo(imovel2);
        System.out.println(catalogo1);

        imovel1.inserirMorador(morador1);
        imovel1.inserirMorador(morador2);
        System.out.println(imovel1);


    }
}
