package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que calcule o mostre a média aritmética de N notas.
 */

public class Exercicio_19 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("quantas notas?");
    double base = scan.nextDouble();

    double soma = 0, media = 0;

    for (int i = 0; i < base; i++) {
      System.out.println("Digite a nota " + (i + 1));
      double nota = scan.nextDouble();
      soma += nota;
    }
    media = (soma / base);
    System.out.println("Soma é: " + soma);
    System.out.println("Media é: " + media);
    scan.close();
  }
}