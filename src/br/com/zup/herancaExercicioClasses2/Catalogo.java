package br.com.zup.herancaExercicioClasses2;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    List<Imovel> catalogoImoveis = new ArrayList<>();
    //Método construtor


    public Catalogo() {

    }

    //Método para adicionar imóveis na lista
    public void adicionaImovelNoCatalogo(Imovel novoImovel) {
        catalogoImoveis.add(novoImovel);
    }

    //método ToString
    @Override
    public String toString() {
        StringBuilder mostraCatalogo = new StringBuilder();
        mostraCatalogo.append("\n Os imóveis do nosso catálogo são: \n" + catalogoImoveis);

        return mostraCatalogo.toString();
    }
}
