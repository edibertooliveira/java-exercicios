package com.bo.study_java.listaDeExercicio_20;

import java.util.Random;
// import java.util.Scanner;

/**
 * Exercicio_1
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).
 */
public class Exercicio_1 {

  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    Random numerRandom = new Random();
    int[][] matrizM = new int[4][4];

    int maior = 0, linha = 0, coluna = 0;

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        matrizM[i][j] = numerRandom.nextInt(100);
        if(matrizM[i][j] > maior) {
          maior =matrizM[i][j] ;
          linha = i +1;
          coluna = j +1;
        } 
        System.out.print(matrizM[i][j] + " ");
      }

      System.out.println();
    }
    System.out.println("Maior numero é " + maior + "\n Linha " + linha + "\n Coluna " + coluna);

  }
}