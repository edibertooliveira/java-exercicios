package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
 */
public class Exercicio_09 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor de Farenheit: ");
    double Farenheit = scan.nextDouble();
    scan.close();
    double result = (5 * (Farenheit -32) / 9);
    System.out.println("graus Celsius é: " + result + "°C");
  }
  
}