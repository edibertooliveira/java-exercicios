package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */

public class Exercicio_10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o M-matutino ou V-Vespertino ou N- Noturno: ");
    String turno = scan.next().toUpperCase();
    scan.close();
  
    if (turno.contains("M")){
      System.out.println("Bom dia");
    }
    else if (turno.contains("V")) {
      System.out.println("Boa tarde");
    } 
    else{
      System.out.println("Boa noite");
    } 
  }
}