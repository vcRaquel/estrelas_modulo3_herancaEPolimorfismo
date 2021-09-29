package br.com.zup.herancaExercicioClasses2;

import java.util.Scanner;

public class Sistema {// Método responsável por automatizar a entrada de dados

    // Outra forma de receber os dados do usuário
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // Exibir possibilidades
    public static void menu() {
        System.out.println("BEM VINDE A IMOBILIARIA VOCÊ SEM CASA MINHA FELICIDADE");
        System.out.println("Digite 1 - Para cadastrar um imóvel. ");
        System.out.println("Digite 2 - Para exibir os imóveis cadastrados. ");
        System.out.println("Digite 3 - Para sair");
    }
    //método para exibir submenu
    public static void menuMoradores(){
        System.out.println("Cadastro de moradores");
        System.out.println("Digite 1 - Para cadastrar um morador");
        System.out.println("Digite 2 - Para sair do submenu");
    }

    // Método responsável por cadastrar moradores
    public static Morador cadastrarMoradores() {
        String nome = capturarDados("Digite seu nome: ").nextLine();
        String cpf = capturarDados("Digite seu cpf: ").nextLine();
        String telefone = capturarDados("Digite o seu telefone: ").nextLine();
        double renda = capturarDados("Digite o salario: ").nextDouble();

        Morador morador = new Morador(nome, cpf, telefone, renda);
        return morador;
    }

    // Método responsável por cadastrar funcionários
    public static Funcionario cadastrarFuncionario() {
        String nome = capturarDados("Digite seu nome: ").nextLine();
        String cpf = capturarDados("Digite seu cpf: ").nextLine();
        String ctps = capturarDados("Digite sua carteira de trabalho: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, ctps);
        return funcionario;
    }

    // Método responsável por cadastrar imóvel
    public static Imovel cadastrarImovel() {
        String endereco = capturarDados("Digite seu endereço: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do aluguel: ").nextDouble();

        Imovel imovel = new Imovel(endereco, valorAluguel);
        return imovel;
    }

    // Método responsável juntar tudo
    public static void executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {


            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            switch (opcaoDoUsuario) {
                case 1:
                    Imovel imovel = cadastrarImovel();
                    Funcionario funcionario = cadastrarFuncionario();
                    imovel.setFuncionarioResponsavel(funcionario);

                    //Criando submenu para cadastrar morador em imóvel
                    boolean submenu = true;
                    while (submenu){
                        menuMoradores();
                        int seletor = capturarDados("Digite a opção desejada").nextInt();
                        if (seletor == 1){
                            Morador morador = cadastrarMoradores(); // para cadastrar morador
                            imovel.adicionarMorador(morador); //para adicionar o morador no imóvel
                        }else if (seletor == 2){
                            System.out.println("Estaremos direcionando você para o menu principal");
                            submenu = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    System.out.println("Obrigado e volte sempre");
                    menu = false;
                    break;
            }
        }
    }
}
