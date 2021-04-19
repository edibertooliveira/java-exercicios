package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.
 */

public class Exercicio_13 {
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