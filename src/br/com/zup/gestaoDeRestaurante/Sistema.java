package br.com.zup.gestaoDeRestaurante;

import java.util.Scanner;

public class Sistema {
    //método para entrada de dados
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //método para exibir menu
    public static void menu() {
        System.out.println("Bem vinde à taberna do Pôney Saltitante");

        System.out.println("Digite 1 - Para exibir o cardápio");
        System.out.println("Digite 2 - Para cadastrar um prato");
        System.out.println("Digite 3 - Para sair");
    }

    //método para criar cadastrar ingredientes:
    public static Ingrediente cadastrarIngrediente() {
        String nomeIngrediente = capturarDados("Digite o nome do ingrediente: ").nextLine();
        String quantidadeIngrediente = capturarDados("Digite a quantidade do Ingrediente: ").nextLine();
        Ingrediente ingrediente = new Ingrediente(nomeIngrediente,quantidadeIngrediente);
        return ingrediente;
    }

    //método para cadastrar os pratos
    public static Prato cadastrarPrato() {
        String nomePrato = capturarDados("Digite o nome do prato: ").nextLine();
        double valorPrato = capturarDados("Digite o valor do prato: ").nextDouble();
        Prato prato = new Prato(nomePrato,valorPrato);
        return prato;
    }




}
