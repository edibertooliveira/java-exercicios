package com.bo.study_java.listaDeExercicio_33;

/**
 * Exercicio_1 Escreva uma classe para representar uma lâmpada. Desenvolva
 * métodos
 * para ligar, desligar a lampada.
 */
public class Exercicio_1 {

  public static void main(String[] args) {
    Lampada lampadaDoTeto = new Lampada();
    
    lampadaDoTeto.setModelo("A60");
    lampadaDoTeto.setTensao("Bivolt");
    lampadaDoTeto.setGarantia(36);
    lampadaDoTeto.setPotencia(7);
    lampadaDoTeto.setTipo(new String[1]);
    lampadaDoTeto.getTipo()[0] = "Abaju";
    lampadaDoTeto.getTipo()[0] = "Lampada";

    lampadaDoTeto.mudaEstado();
    System.out.println("Lampada esta " + 
    lampadaDoTeto.obterEstado());

    lampadaDoTeto.mudaEstado();
    System.out.println("Lampada esta " + 
    lampadaDoTeto.obterEstado());
  }
}