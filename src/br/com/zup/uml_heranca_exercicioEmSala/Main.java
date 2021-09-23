package br.com.zup.uml_heranca_exercicioEmSala;

public class Main {
    public static void main(String[] args) {
        //testando métodos da classe Heroi
        Heroi heroi1 = new Heroi("Gandalf",8000);
        System.out.println("Nome: " + heroi1.getNome());
        heroi1.trocarNome("Aragorn");
        System.out.println("Nome: " + heroi1.getNome());
        heroi1.receberDano(200);
        System.out.println("Vida: " + heroi1.exibirVida());

        //testando métodos da classe Mago
        Mago mago1 = new Mago("Saruman",8000,94);
        heroi1.receberDano(mago1.aplicarMagia());
        System.out.println("Vida do herói: " + heroi1.getVida());
    }
}
