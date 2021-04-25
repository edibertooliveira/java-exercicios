package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
 */

public class Exercicio_16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Equaçao do 2o grau da forma: ax² + bx + c");
    System.out.println("Digite coeficiente a: ");
    int coeficienteA = scan.nextInt();

  
    if (coeficienteA == 0){
      System.out.println("Se a=0, não é equação do segundo grau. Tchau");
    } else{
      System.out.println("Digite coeficiente b");
      int coeficienteB = scan.nextInt();
      System.out.println("Digite coeficiente c");
      int coeficienteC = scan.nextInt();
      scan.close();
      double delta = (coeficienteB * coeficienteB) - ((coeficienteA * coeficienteC) * 4);

      if (delta < 0) System.out.println("Delta menor que 0. Raízes imaginárias. Tchau");
      
      else if (delta == 0){
        double raiz = - coeficienteB / (2 * coeficienteA);
        System.out.println("Delta=0 , raiz = ," + raiz);
      } else {
        double raiz1 = (-coeficienteB + Math.sqrt(delta) ) / (2 * coeficienteA);
        double raiz2 = (-coeficienteB - Math.sqrt(delta) ) / (2 * coeficienteA);
        System.out.println("Raizes: " + raiz1 + " e " + raiz2);
      }
      System.out.println("Boa noite");
    } 
  }
}