package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o
o
o
o
o
o
Média de Aproveitamento
Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */

public class Exercicio_14 {
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