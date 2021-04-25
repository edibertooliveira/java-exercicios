package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_3
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
 */
public class Exercicio_3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[15];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      int posicao = scan.nextInt();
      vetorA[i] = posicao;
      vetorB[i] = vetorA[i] * vetorA[i];
    }

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Vetor A: " + vetorA[i]);
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Vetor B: " + vetorB[i]);
    }

    scan.close();

  }
}