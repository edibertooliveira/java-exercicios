package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa para leitura de três notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e presentar:
. A mensagem "Aprovado", se a média for maior ou igual a 7,
com a respectiva média alcançada;
a. A mensagem "Reprovado", se a média for menor do que 7, com
a respectiva média alcançada;
b. A mensagem "Aprovado com Distinção", se a média for igual a
10.
 */

public class Exercicio_20 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite três notas:");
    double nota01 = scan.nextDouble();
    double nota02 = scan.nextDouble();
    double nota03 = scan.nextDouble();
    scan.close();
    double resultado = ((nota01 + nota02 + nota03) / 3);
    if (resultado >= 10){
      System.out.println("Aprovado com Distinção");
    }
    else if (resultado >= 7) {
      System.out.println("Aprovado");
    } 
    else if (resultado < 7){
      System.out.println("Reprovado");
    } 
  }
}