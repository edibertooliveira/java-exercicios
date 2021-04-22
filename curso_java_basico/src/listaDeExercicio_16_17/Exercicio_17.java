package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */

public class Exercicio_17 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Fatorial");
    int num = scan.nextInt();
    
    System.out.println(num + "! = " + num + " * \n");
    
    int fatorial = 1;
    for (int index = num; index > 0; index -= 1) {
      fatorial *= index;
      System.out.println(index + " * ");
    }
    System.out.println("\nResultado: " + fatorial);

    scan.close();
  }
}