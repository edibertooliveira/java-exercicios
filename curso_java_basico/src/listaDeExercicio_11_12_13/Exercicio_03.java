package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima a soma.
 */

public class Exercicio_03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int primeiroNumero = scan.nextInt(); 
    System.out.println("Digite outro numero: ");
    int segundoNumero = scan.nextInt();
    scan.close();
    System.out.println("A soma deles é: " + (primeiroNumero + segundoNumero));
  }
  
}