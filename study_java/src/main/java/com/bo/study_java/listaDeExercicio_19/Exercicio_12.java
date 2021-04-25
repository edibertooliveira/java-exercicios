package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_12
 *Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
 */
public class Exercicio_12 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int soma = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
      soma += vetorA[i];
    
    }
    System.out.println("Soma de numeros: " + soma);

    scan.close();

  }
}