package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.
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