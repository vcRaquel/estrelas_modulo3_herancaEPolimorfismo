package br.com.zup.herancaListaExercicioClasses;

public class Main {
    public static void main(String[] args) {
    Fornecedor fornecedor1 = new Fornecedor("Caio","rua4, bairro 5, cidade 6","123456789", 10000,4550.54);
        System.out.println("Saldo do fornecedor: R$" + fornecedor1.obterSaldo());
    }
}
