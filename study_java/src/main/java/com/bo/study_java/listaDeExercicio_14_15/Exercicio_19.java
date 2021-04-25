package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */

public class Exercicio_19 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número inteiro menor que 1000");

    int valor = scan.nextInt();
    scan.close();
  
    if (valor > 0) {
      int unidade = valor % 10;
      int dezena = (valor / 10) % 10;
      int centena = (valor / 100) % 10;

      String unidadeEPlural = unidade == 1 
      || unidade == 0 ? "unidade" : "unidades";

      String dezenaEPlural = dezena == 1 
      || dezena == 0 ? "dezena" : "dezenas";

      String centenaEPlural = centena == 1 
      || centena == 0 ? "centena" : "centenas";

      if(centena == 0) {
        if(dezena == 0) {
          System.out.println(
            unidade + " " + unidadeEPlural
          );
        } else {
            System.out.println(
              dezena + " " + dezenaEPlural + ", " + 
              unidade + " " + unidadeEPlural
            );
          }
      }
      else {
        System.out.println(
          centena + " " + centenaEPlural + ", " +  
          dezena + " " + dezenaEPlural + ", " +  
          unidade + " " + unidadeEPlural
        );
      } 
    }
  }
}