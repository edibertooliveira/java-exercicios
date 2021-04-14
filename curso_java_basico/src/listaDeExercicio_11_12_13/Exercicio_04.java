package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que converta metros para centímetros.
 */

public class Exercicio_04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos metros?: ");
    int metroDigitado = scan.nextInt();
    scan.close();
    System.out.println(metroDigitado + "cm" + " convertido em centimetros é: " + (metroDigitado * 100) + "cm");
  }
}