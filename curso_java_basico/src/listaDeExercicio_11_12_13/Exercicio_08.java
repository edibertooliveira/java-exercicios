package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
 */
public class Exercicio_08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o quanto você ganha por hora: ");
    double ganhoPorHora = scan.nextDouble();
    System.out.println("Digite horas trabalhadas: ");
    double horaTrabalhadas = scan.nextDouble();
    scan.close();
    double result = ganhoPorHora * horaTrabalhadas;
    System.out.println("Valor em dinheiro é: " + result);
  }
  
}