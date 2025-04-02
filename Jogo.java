package br.edu.ifsp.spo.java.cards;

public class Jogo {
    private final Baralho baralho;
    private final Jogador jogador;
    private final Jogador jogador2;
    public Jogo() {
        this.baralho = new Baralho();
        this.jogador=new Jogador("zé");
        this.jogador2=new Jogador("mané");
    }

}
