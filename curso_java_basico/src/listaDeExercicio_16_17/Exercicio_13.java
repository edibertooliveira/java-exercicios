package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
 */

public class Exercicio_13 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com a base:");
    int base = scan.nextInt();

    System.out.println("Entre com a potência:");
    int pot = scan.nextInt();

    int resultado = base;
    for (int i = 1; i < pot; i++) {
      resultado *= base;
    }
    System.out.println(resultado);
    scan.close();
  }
}