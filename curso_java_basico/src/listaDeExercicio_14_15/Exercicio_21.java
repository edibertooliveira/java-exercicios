package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas
existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.
 */

public class Exercicio_21 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número inteiro maior que 10 e menor que 600");

    int valor = 599;
    scan.close();
    
    String notas = "Notas ";
    if (valor >= 10 && valor <= 600) {
      int cem = (valor / 100);
      valor = valor % 100;
      int cinquenta = (valor  / 50);
      valor = valor  % 50;
      int dez = (valor / 10);
      valor = valor  % 10;
      int cinco = (valor / 5);
      valor = valor  % 5;
      int um = valor;

      if (cem != 0) {
        notas = notas + "R$100,00 x" + cem + ", ";
      }
      if (cinquenta != 0) {
        notas = notas + "R$50,00 x" + cinquenta + ", ";
      } 
      if (dez != 0) {
        notas = notas + "R$10,00 x" + dez + ", ";
      } 
      if (cinco != 0) {
        notas = notas + "R$5,00 x" + cinco + ", ";
      } 
      if (um != 0) {
        notas = notas + "R$1,00 x" + um + ", ";
      } 

    System.out.println(notas);

    }
  }
}