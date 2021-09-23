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

        //testando métodos da classe guerreiro
        Guerreiro guerreiro1 = new Guerreiro("Hurin",7500,90);
        mago1.receberDano(guerreiro1.aplicarDano());
        System.out.println("Vida do Mago: " + mago1.getVida());

        //testando métodos da classe Inimigo
        Inimigo inimigo1 = new Inimigo("Melkor",10000);
        System.out.println("Nome: " + inimigo1.getNome());
        inimigo1.trocarNome("Sauron");
        System.out.println("Nome: " + inimigo1.getNome());
        inimigo1.receberDano(200);
        System.out.println("Vida do inimigo: " + inimigo1.exibirVida());

        //testando métodos da classe Rasteiro
        Rasteiro rasteiro1 = new Rasteiro("Língua de Cobra", 5000,57);
        inimigo1.receberDano(rasteiro1.aplicarDano());
        System.out.println("A vida do inimigo: " + inimigo1.getVida());
    }
}
