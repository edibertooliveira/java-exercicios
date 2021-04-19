package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A men
 */

public class Exercicio_05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite dois numeros:");
    double numero01 = scan.nextDouble();
    double numero02 = scan.nextDouble();
    scan.close();
    double resultado = ((numero01 + numero02) / 2);
    if (resultado >= 10){
      System.out.println("Aprovado com Distinção");
    }
    else if (resultado >= 7) {
      System.out.println("Aprovado");
    } 
    else{
      System.out.println("Reprovado");
    } 
  }
}