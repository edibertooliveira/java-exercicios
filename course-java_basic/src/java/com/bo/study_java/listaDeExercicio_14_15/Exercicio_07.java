package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior e o menor
deles.
 */

public class Exercicio_07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite tres numeros: ");
    int numero01 = scan.nextInt();
    int numero02 = scan.nextInt();
    int numero03 = scan.nextInt();
    scan.close();

    int maiorNumero = numero03;
    int menorNumero = numero03;

    if (numero01 > numero02 & numero01 > numero03){
      maiorNumero = numero01;
    }
    else if (numero02 > numero01 & numero02 > numero03) {
      maiorNumero = numero02;
    }
    if (numero01 < numero02 & numero01 < numero03){
      menorNumero = numero01;
    }
    else if (numero02 < numero01 & numero02 < numero03) {
      menorNumero = numero02;
    }

    System.out.println(
      "Maior numero é: " + maiorNumero + 
      ", Menor numero é: " + menorNumero
      );
    
  }
}