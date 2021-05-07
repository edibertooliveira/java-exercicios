package com.enumTestes;

import java.util.Arrays;

import static com.enumTestes.DiaSemana.*;
import static com.enumTestes.TipoDocumento.*;

public class App {

//    public static void main(String[] args) {
//
//        System.out.println(terca + " - " + terca.getValor());
//        System.out.println(sexta + " - " + sexta.getValor());
//    }

    //    public static void main(String[] args) {
//        DiaSemana[] dia = DiaSemana.values();
//        Arrays.stream(dia).forEach(e-> System.out.println(e + " " + e.getValor()));
//    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTest());
        System.out.println(pessoa.getTipoDocumento());
        System.out.println(pessoa.getNumeroDocumento());
    }
}
