package br.edu.ifsp.spo.java.cards;

import java.text.MessageFormat;
import java.util.ArrayList;

import java.util.List;
public class App {

    public static void main(String[] args) {

        Carta carta1=new Carta(Naipe.ESPADAS,Valor.AS);
        Carta carta2=new Carta(Naipe.COPAS,Valor.DAMA);

        List<Carta>Listacartas=new ArrayList<>();

        Listacartas.add(carta1);
        Listacartas.add(carta2);

        Scorer scorer=new Scorer();

        int resultado=scorer.checkScore(Listacartas);

        System.out.println("A pontuação das cartas é:"+resultado);

        Baralho baralho = new Baralho();
        Jogo Vinteum= new Jogo();

        System.out.println(Vinteum);
        Carta carta = baralho.tirarCarta();

        System.out.println(MessageFormat.format("Cartas restantes no baralho: {0}", baralho.cartasRestantes()));
    }
}