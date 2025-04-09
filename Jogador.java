package br.edu.ifsp.spo.java.cards;


import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;

    private List<Carta> mao;
    public Jogador(String nome){
        this.nome=nome;
        this.mao=new ArrayList<Carta>();

    }
    //RECEBER CARTA E ADICIONAR A MÃO DO JOGADOR
     public void receberCarta(Carta carta){
        this.mao.add(carta);
    }

    @Override
    public String toString(){
        String resultado= "Jogador:" + this.nome;
        resultado+="\n mão do jogador:";
        for(Carta carta:this.mao){
            resultado+="\n"+carta.toString();
        }
        return resultado;
    }
}
