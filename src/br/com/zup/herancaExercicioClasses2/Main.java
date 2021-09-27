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

public class Main {
    public static void main(String[] args) {
        Morador morador1 = new Morador("Caio", "1236547", "1236547", "Jardim 123", true);
        Morador morador2 = new Morador("José", "1235447", "1236565", "Jardim 123", false);

        Funcionario funcionario1 = new Funcionario("José","42423565","983735637", "78968756","Corretor");
        Imovel imovel1 = new Imovel("Jardim 123", "Jardim das flores 123", 2545.50,"José");

        imovel1.inserirMorador(morador1);
        imovel1.inserirMorador(morador2);
        System.out.println(imovel1);



    }
}
