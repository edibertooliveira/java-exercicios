package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */

public class Exercicio_17 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o ano: ");
    short ano = scan.nextShort();
    scan.close();
  
    if (ano % 4 == 0 & ano % 100 == 0){
      System.out.println("Bissexto");
    }
    else {
      System.out.println("Não é bissexto");
    } 
  }
}