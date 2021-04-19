package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite dois numeros:");
    int numero01 = scan.nextInt();
    int numero02 = scan.nextInt();
    scan.close();
    int resultado = numero01;
    if (numero01 < numero02) resultado = numero02;
    System.out.println("valor: " + resultado);
  }
}