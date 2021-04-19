package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */

public class Exercicio_08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite tres numeros: ");
    double numero01 = scan.nextDouble();
    double numero02 = scan.nextDouble();
    double numero03 = scan.nextDouble();
    scan.close();
  

    double menorNumero = numero03;

    if (numero01 < numero02 & numero01 < numero03){
      menorNumero = numero01;
    }
    else if (numero02 < numero01 & numero02 < numero03) {
      menorNumero = numero02;
    }

    System.out.println( 
      "Menor preço é: " + menorNumero
      );
  }
}