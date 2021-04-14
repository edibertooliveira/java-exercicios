package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */
public class Exercicio_06 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a área do Circulo em metros: ");
    double raioDoCirculo = scan.nextDouble();
    scan.close();
    double PI = 3.14;
    double result = PI * (raioDoCirculo * raioDoCirculo);
    System.out.println("A área do circulo é: " + result + "m²");
  }
  
}