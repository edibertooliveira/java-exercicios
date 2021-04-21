package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */

public class Exercicio_14 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int contePar = 0;
    int conteImpar = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Entre com um numero:");
      int base = scan.nextInt();
      
      if(base % 2 == 0) contePar += 1;
      else conteImpar += 1;
    }
    System.out.println("Pares: " + contePar);
    System.out.println("Impares: " + conteImpar);
    scan.close();
  }
}