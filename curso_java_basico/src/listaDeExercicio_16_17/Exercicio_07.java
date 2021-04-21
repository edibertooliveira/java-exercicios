package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maior número.
 */

public class Exercicio_07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int maior = Integer.MIN_VALUE;
    for (int i = 0; i <= 5; i++) {

      System.out.println("Entre com um numero");
      int nun = scan.nextInt();
      
      if(nun > maior) {
        maior = nun;
        System.out.println("O numero maior mudou " + maior);
      } 
    }
    System.out.print("O maior número digitado foi: " + maior);
    scan.close();
  }
  
}