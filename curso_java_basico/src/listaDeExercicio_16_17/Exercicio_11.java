package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Altere o programa anterior para mostrar no final a soma dos números.
 */

public class Exercicio_11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com dois numeros inteiro: ");
    int num01 = scan.nextInt();
    int num02 = scan.nextInt();
    int soma = 0;
    for (int i = num01; i <= num02; i++) {
      System.out.println(i);
      soma += i;
      
    }
    System.out.println("Soma final: " + soma);
    scan.close();
  }
}