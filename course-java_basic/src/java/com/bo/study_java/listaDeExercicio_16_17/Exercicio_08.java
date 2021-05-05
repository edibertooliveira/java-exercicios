package com.bo.study_java.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe a soma e a média
dos números.
 */

public class Exercicio_08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int media, soma = 0;

    for (int i = 0; i <= 5; i++) {
      System.out.println("Entre com um numero");
      int numero = scan.nextInt();
      soma += numero;
    }
    media = (soma / 5);
    System.out.println("Soma é igual a: " + soma);
    System.out.println("Média é igual a: " + media);
    scan.close();
  }
  
}