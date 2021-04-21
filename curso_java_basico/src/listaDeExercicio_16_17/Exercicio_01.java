package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
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
