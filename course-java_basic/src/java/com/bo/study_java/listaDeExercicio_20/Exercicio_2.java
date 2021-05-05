package com.bo.study_java.listaDeExercicio_20;

import java.util.Random;
// import java.util.Scanner;

/**
 * Exercicio_2
 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
 */
public class Exercicio_2 {

  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    Random numerRandom = new Random();
    int[][] matrizM = new int[10][10];

    int maior5 = 0, menor5 = 101;
    int maior7 = 0, menor7 = 101;

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        matrizM[i][j] = numerRandom.nextInt(100);
        if(i == 5) {
          if (matrizM[i][j] > maior5) {
            maior5 =matrizM[i][j] ;
          } 
          if (matrizM[i][j] < menor5) {
            menor5 =matrizM[i][j] ;
          }
        } if(i == 7) {
          if (matrizM[i][j] > maior7) {
            maior7 =matrizM[i][j] ;
          } 
          if (matrizM[i][j] < menor7) {
            menor7 =matrizM[i][j] ;
          }
        } 
        System.out.print(matrizM[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Maior numero da linha 5 é " + maior5);
    System.out.println("Menor numero da linha 5 é " + menor5);

    System.out.println("Maior numero da linha 7 é " + maior7);
    System.out.println("Menor numero da linha 7 é " + menor7);

  }
}