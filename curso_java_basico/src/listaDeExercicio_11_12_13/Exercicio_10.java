package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */
public class Exercicio_10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor de Celsius: ");
    double celsius = scan.nextDouble();
    scan.close();
    double result = (((celsius * 9) / 5.0) + 32);
    System.out.println("graus Celsius é: " + result + "°F");
  }
  
}