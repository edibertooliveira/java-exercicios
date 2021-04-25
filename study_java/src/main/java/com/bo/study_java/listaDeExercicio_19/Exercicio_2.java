package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_1
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
 */
public class Exercicio_2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[8];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      int posicao = scan.nextInt();
      vetorA[i] = posicao;
      vetorB[i] = vetorA[i] * 2;
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Vetor A: " + vetorA[i]);
      System.out.println("Vetor B: " + vetorB[i]);
    }

    scan.close();

  }
}