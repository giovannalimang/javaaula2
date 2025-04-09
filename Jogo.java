package br.edu.ifsp.spo.java.cards;

public class Jogo {
    private final Baralho baralho;
    private final Jogador jogador;
    private final Jogador jogador2;
    public Jogo() {
        this.baralho = new Baralho();
        this.jogador=new Jogador("marina");
        this.jogador2=new Jogador("ari");
        int tamanhoInicialMao=2;
        for(int i=0;i<tamanhoInicialMao;i++) {
            this.jogador.receberCarta(this.baralho.tirarCarta());
            this.jogador2.receberCarta(this.baralho.tirarCarta());
        }

    }

    @Override
    public String toString(){
        String resultado="Jogo generico \n";
        resultado+="\n Jogadores:";
        resultado+="\n -"+this.jogador;
        resultado+="\n -"+this.jogador2;
        return resultado;
    }
}
