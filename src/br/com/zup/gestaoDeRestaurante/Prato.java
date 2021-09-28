package br.com.zup.gestaoDeRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    List<Ingrediente> ingredientes = new ArrayList<>();
    private double valor;

    //Métodos construtores
    public Prato() {

    }

    public Prato(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Método para adicionar um ingrediente
    public void adicionarIngrediente(Ingrediente novoIngrediente) {
        ingredientes.add(novoIngrediente);
    }

}