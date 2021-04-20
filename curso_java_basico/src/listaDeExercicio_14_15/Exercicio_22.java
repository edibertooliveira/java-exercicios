package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */

public class Exercicio_22 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero:");
    int numero = scan.nextInt();
    scan.close();
    
    String status = "Impar";  
    if (numero % 2 == 0) {
      status = "Par";
    }
    System.out.println("status: " + status);
  }
}