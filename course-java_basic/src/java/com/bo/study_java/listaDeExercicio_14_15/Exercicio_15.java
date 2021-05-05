package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
 */

public class Exercicio_15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 3 lados de um triângulo: ");
    double ladoUm = scan.nextDouble();
    double ladoDois = scan.nextDouble();
    double ladoTres = scan.nextDouble();
    scan.close();
  
    if (ladoUm > (ladoDois + ladoTres) 
    || ladoDois > (ladoUm + ladoTres) 
    || ladoTres > (ladoDois + ladoUm)) {
      System.out.println("Não pode ser um triangulo");
    }
    else if (ladoUm == ladoDois && ladoUm == ladoTres) {
      System.out.println("equilátero");
    } 
    else{
      System.out.println("isósceles");
    } 
  }
}