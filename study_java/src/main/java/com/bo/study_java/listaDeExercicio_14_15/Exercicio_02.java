package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */

public class Exercicio_02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite dois numeros:");
    int numero = scan.nextInt();
    scan.close();
    String resultado = "positivo";
    if(numero < 0) {
      resultado = "negativo";
    };

    System.out.println("valor: " + resultado);
  }
}