package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_9
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:	
  	
  
C[i] = A[i] / float(B[i]).
 */
public class Exercicio_9 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    double[] vetorC = new double[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição A: " + i);
      vetorA[i] =scan.nextInt();
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Entre com o valor da posição B: " + i);
      vetorB[i] =  scan.nextInt();
      vetorC[i] =  vetorA[i] / vetorB[i];
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Vetor C: " + vetorC[i]);
    }

    scan.close();

  }
}