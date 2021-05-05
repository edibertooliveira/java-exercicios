package com.bo.study_java.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
 */

public class Exercicio_10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com dois numeros inteiro: ");
    int num01 = scan.nextInt();
    int num02 = scan.nextInt();
    for (int i = num01; i <= num02; i++) {
      System.out.println(i);

    }
    scan.close();
  }
}