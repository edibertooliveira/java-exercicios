package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.
 */

public class Exercicio_23 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero:");
    double numero = scan.nextDouble();
    scan.close();
    
    String status = "Decimal";  
    if (numero == Math.round(numero)) {
      status = "Inteiro";
    }
    System.out.println("status: " + status);
  }
}