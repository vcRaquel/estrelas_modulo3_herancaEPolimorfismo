package br.com.zup.gestaoDeRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Prato> cardapio = new ArrayList<>();

    //Método construtor
    public Restaurante() {

    }

    //Getter
    public List<Prato> getCardapio() {
        return cardapio;
    }

    //Método para adicionar um prato
    public void adicionarPrato(Prato novoPrato){
        cardapio.add(novoPrato);
    }


}
