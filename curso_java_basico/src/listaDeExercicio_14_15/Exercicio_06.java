package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior deles.
 */

public class Exercicio_06 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite tres numeros: ");
    double numero01 = scan.nextDouble();
    double numero02 = scan.nextDouble();
    double numero03 = scan.nextDouble();
    scan.close();
  
    if (numero01 > numero02 & numero01 > numero03){
      System.out.println("Primeiro numero");
    }
    else if (numero02 > numero01 & numero02 > numero03) {
      System.out.println("Segundo numero");
    } 
    else{
      System.out.println("Terceiro numero");
    } 
  }
}