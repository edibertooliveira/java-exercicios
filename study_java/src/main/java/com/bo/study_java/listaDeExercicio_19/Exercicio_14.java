package com.bo.study_java.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_14
 *Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.
 */
public class Exercicio_14 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double[] vetorA = new double[10];
    int soma = 0;
    int conte = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
      if(vetorA[i] % 2 > 0) {
        soma += vetorA[i];
        conte += 1;
      }
    }
    System.out.println("Soma dos numeros impares: " + soma + "\nMas a média: " + (soma / conte));

    scan.close();

  }
}