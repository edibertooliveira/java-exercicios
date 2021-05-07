package com.enumTestes;

public enum DiaSemana {
    segunda(1), terca(2),quarta(3),
    quinta(4),sexta(5),sabado(6),
    domingo(7);

//    segunda, terca,quarta,
//    quinta,sexta,sabado,
//    domingo;

    private int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


}
