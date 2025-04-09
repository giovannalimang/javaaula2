package br.edu.ifsp.spo.java.cards;

import java.util.List;

public class Scorer {

//fiz junto com a marina trindade SP3115046
    public int checkScore(List<Carta> Listacartas) {
        int resultado = 0;

        for (Carta carta : Listacartas) {
            if (carta.getValor().equals(Valor.AS)) {
                resultado += 1;
            } else if (carta.getValor().equals(Valor.DOIS)) {
                resultado += 2;
            } else if (carta.getValor().equals(Valor.TRES)) {
                resultado += 3;
            } else if (carta.getValor().equals(Valor.QUATRO)) {
                resultado += 4;
            } else if (carta.getValor().equals(Valor.CINCO)) {
                resultado += 5;
            } else if (carta.getValor().equals(Valor.SEIS)) {
                resultado += 6;
            } else if (carta.getValor().equals(Valor.SETE)) {
                resultado += 7;
            } else if (carta.getValor().equals(Valor.OITO)) {
                resultado += 8;
            } else if (carta.getValor().equals(Valor.NOVE)) {
                resultado += 9;
            } else if (carta.getValor().equals(Valor.DEZ)) {
                resultado += 10;
            } else if (carta.getValor().equals(Valor.DAMA) || carta.getValor().equals(Valor.VALETE) || carta.getValor().equals(Valor.REI)) {
                resultado += 10;
            }
        }
        return resultado;
    }
}
