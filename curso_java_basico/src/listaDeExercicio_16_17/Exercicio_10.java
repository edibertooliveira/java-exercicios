package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com dois numeros inteiro: ");
    int num01 = scan.nextInt();
    int num02 = scan.nextInt();
    for (int i = num01; i <= num02; i++) {
      System.out.println(i);

      if(i % 2 > 0) System.out.println(i);
    }
    scan.close();
  }
}