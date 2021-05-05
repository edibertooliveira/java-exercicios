package com.bo.study_java.listaDeExercicio_16_17;

/**
 * Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */

public class Exercicio_04 {
  public static void main(String[] args) {
    double populacaoA = 80000;
    double populacaoB = 200000;
    double taxaA = 3.0;
    double taxaB = 1.5;

    int anos = 0; 
    do {
      populacaoA = (((populacaoA / 100) * taxaA) + populacaoA);
      populacaoB = (((populacaoB / 100) * taxaB) + populacaoB);
      anos += 1;

    } while(populacaoB > populacaoA );

    if (anos > 1) {
      System.out.println(
        "Em: " + anos + 
        " anos, " + 
        " População de: \nA " + Math.round(populacaoA) + 
        ", \nB " + Math.round(populacaoB));
    } else {
      System.out.println(
        "Em: " + anos + 
        " ano, " + 
        " População de: A " + Math.round(populacaoA) + 
        ", B " + Math.round(populacaoB));
    }
  }
}