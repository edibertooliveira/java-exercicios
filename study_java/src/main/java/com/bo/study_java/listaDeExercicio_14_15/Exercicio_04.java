package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.
 */

public class Exercicio_04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite vogal ou consoante: ");
    String letraDigitado = scan.next().toLowerCase();
    scan.close();

    switch (letraDigitado) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
        System.out.println("valor: vogal");
        break;
    
      default:
      System.out.println("valor: consoante");
        break;
    }
  }
}