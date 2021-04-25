package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_11
 *Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
 */
public class Exercicio_11 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int conte = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
      if(vetorA[i] % 2 == 0) {
        conte += 1;
      }
    }
    System.out.println("Quantidades de numeros pares: " + conte);

    scan.close();

  }
}