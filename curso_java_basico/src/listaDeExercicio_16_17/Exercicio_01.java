package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean notaValida = false;
    do {
      System.out.println("Digite uma nota 1 a 10:");
      int nota = scan.nextInt();
      if(nota >= 1 && nota <= 10) {
        notaValida = true;
        System.out.println("Opa! Nota certa, Obrigado!");
      } else {
        System.out.println("Voce digitou uma nota errada!");
      }
    } while(!notaValida);
    scan.close();
    
  }
}
