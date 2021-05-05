package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_1
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
 */
public class Exercicio_1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      int posicao = scan.nextInt();
      vetorA[i] = posicao;
      vetorB[i] = vetorA[i];
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Vetor A: " + vetorA[i]);
      System.out.println("Vetor B: " + vetorB[i]);
    }

    scan.close();

  }
}