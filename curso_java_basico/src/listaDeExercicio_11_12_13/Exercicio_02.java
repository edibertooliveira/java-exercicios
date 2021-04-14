package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */
public class Exercicio_02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero");
    int numeroDigitado = scan.nextInt();
    scan.close();
    System.out.println("O numero digitado foi: " + numeroDigitado);
  }
}