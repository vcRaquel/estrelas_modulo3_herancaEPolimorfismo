package br.com.zup.gestaoDeRestaurante;

import java.util.Scanner;

public class Sistema {
    //método para entrada de dados
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
