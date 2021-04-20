package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número  é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.
 */

public class Exercicio_24 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    System.out.println("Digite o segundo numero: ");
    System.out.println("Qual operacao voce deseja? (+, -, *, /): ");
    int numero01 = scan.nextInt();
    int numero02 = scan.nextInt();
    String operacao = scan.next();
    scan.close();

    switch (operacao) {
      case "+":
        int calcSum = numero01 + numero02;
        if (calcSum % 2 == 0) {
          System.out.println(calcSum + " é par");
        } else {
          System.out.println(calcSum + " é impar");
        }
        if (calcSum > 0) {
          System.out.println(calcSum + " é Positivo");
        } else {
          System.out.println(calcSum + " é Negativo");
        }
        if (calcSum == Math.round(calcSum)) {
          System.out.println(calcSum + " é Inteiro");
        } else {
          System.out.println(calcSum + " é Decimal");
        }
        break;
      case "-":
        int calcSub = numero01 - numero02;
        if (calcSub % 2 == 0) {
          System.out.println(calcSub + " é par");
        } else {
          System.out.println(calcSub + " é impar");
        }
        if (calcSub > 0) {
          System.out.println(calcSub + " é Positivo");
        } else {
          System.out.println(calcSub + " é Negativo");
        }
        if (calcSub == Math.round(calcSub)) {
          System.out.println(calcSub + " é Inteiro");
        } else {
          System.out.println(calcSub + " é Decimal");
        }
        break;
      case "/":
      int calcDiv = numero01 / numero02;
      if (calcDiv % 2 == 0) {
        System.out.println(calcDiv + " é par");
      } else {
        System.out.println(calcDiv + " é impar");
      }
      if (calcDiv > 0) {
        System.out.println(calcDiv + " é Positivo");
      } else {
        System.out.println(calcDiv + " é Negativo");
      }
      if (calcDiv == Math.round(calcDiv)) {
        System.out.println(calcDiv + " é Inteiro");
      } else {
        System.out.println(calcDiv + " é Decimal");
      }
        break;
      case "*":
      int calcMult = numero01 * numero02;
      if (calcMult % 2 == 0) {
        System.out.println(calcMult + " é par");
      } else {
        System.out.println(calcMult + " é impar");
      }
      if (calcMult > 0) {
        System.out.println(calcMult + " é Positivo");
      } else {
        System.out.println(calcMult + " é Negativo");
      }
      if (calcMult == Math.round(calcMult)) {
        System.out.println(calcMult + " é Inteiro");
      } else {
        System.out.println(calcMult + " é Decimal");
      }
        break;
      default:
        break;
    }
    if (operacao == "+") {
      
    }
    
  }
}