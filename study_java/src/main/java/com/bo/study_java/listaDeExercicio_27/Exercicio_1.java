package com.bo.study_java.listaDeExercicio_27;

/**
 * Exercicio_1 Escreva uma classe para representar uma lâmpada. Desenvolva
 * métodos
 * para ligar, desligar a lampada.
 */
public class Exercicio_1 {

  public static void main(String[] args) {
    Lampada lampadaDoTeto = new Lampada();
    
    lampadaDoTeto.modelo = "A60";
    lampadaDoTeto.tensao = "Bivolt";
    lampadaDoTeto.garantia = 36;
    lampadaDoTeto.potencia = 7;
    lampadaDoTeto.tipo = new String[1];
    lampadaDoTeto.tipo[0] = "Abaju";
    lampadaDoTeto.tipo[0] = "Lampada";

    lampadaDoTeto.mudaEstado();
    System.out.println("Lampada esta " + 
    lampadaDoTeto.obterEstado());

    lampadaDoTeto.mudaEstado();
    System.out.println("Lampada esta " + 
    lampadaDoTeto.obterEstado());
  }
}