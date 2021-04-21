package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean senhaValida = false;
    do {
      System.out.println("Digite seu login e uma senha");
      System.out.println("Digite login: \n");
      String nome = scan.next();
      System.out.println("Digite senha: \n");
      String senha = scan.next();
      if(!senha.contains(nome)) {
        senhaValida = true;
        System.out.println("Opa! senha certa, Obrigado!");
      } else {
        System.out.println("Voce digitou uma senha errada!");
      }
    } while(!senhaValida);
    scan.close();
    
  }
}