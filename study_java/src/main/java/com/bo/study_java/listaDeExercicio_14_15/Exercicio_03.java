package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

public class Exercicio_03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite F ou M: ");
    String sexoDigitado = scan.next().toUpperCase();
    scan.close();

    if(sexoDigitado.contains("F")) {
      System.out.println("valor: Feminino, " + sexoDigitado);
    } else if (sexoDigitado.contains("M"))  {
      System.out.println("valor: Masculino, " + sexoDigitado);
    } else {
      System.out.println("valor invalifdo " + sexoDigitado);
    };

  }
}