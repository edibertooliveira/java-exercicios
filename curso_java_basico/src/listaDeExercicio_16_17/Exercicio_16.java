package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * A
série
de
Fibonacci
é
formada
pela
seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
 */

public class Exercicio_16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("fibonacci");

    int num1 = 0, num2 = 1, proximo = 0;
    System.out.println(num1);
    System.out.println(num2);
    
    while (proximo < 500) {
        proximo = num1 + num2;
        num1 = num2;
        num2 = proximo;
        System.out.println(proximo);
    }

    scan.close();
  }
}