package com.bo.study_java.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados.
 */

public class Exercicio_18 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com um numero");
    int num = scan.nextInt();
    
    boolean temPrimo = true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0 ) {
        System.out.println("Não é primo - divisivel por: " + i);
        temPrimo = false;
      }
    }
    if (temPrimo) {
      System.out.println("É numero primo");
    }
    scan.close();
  }
}