package com.bo.study_java.listaDeExercicio_16_17;

// import java.util.Scanner;

/**
 * Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.
 */

public class Exercicio_09 {
  public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);
    for (int i = 0; i <= 50; i++) {
      // System.out.println(i);

      if(i % 2 > 0) System.out.println(i);
    }
  }
}