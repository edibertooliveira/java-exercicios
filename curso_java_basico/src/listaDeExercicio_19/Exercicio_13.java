package curso_java_basico.src.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_13
 *Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
 */
public class Exercicio_13 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int soma = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
      if(vetorA[i] % 5 == 0) {
        soma += vetorA[i];
      }
    }
    System.out.println("Soma de numeros divisiveis por 5: " + soma);

    scan.close();

  }
}