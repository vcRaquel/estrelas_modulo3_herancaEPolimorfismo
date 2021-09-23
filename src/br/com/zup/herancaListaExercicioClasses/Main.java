package br.com.zup.herancaListaExercicioClasses;

public class Main {
    public static void main(String[] args) {
        //testando método obterSaldo da classe Fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Caio", "rua4, bairro 5, cidade 6", "123456789", 10000, 4550.54);
        System.out.println("Saldo do fornecedor: R$" + fornecedor1.obterSaldo());

        //testando método calcularSalario da classe Colaborador
        Colaborador colaborador1 = new Colaborador("Maia", "Rua seilá, n 4, de sei lá onde", "32145687", 3,2000,50);
        System.out.println("O salário líquido do colaborador é: RS " + colaborador1.calcularSalario());

    }
}
