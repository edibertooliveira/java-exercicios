package curso_java_basico.src.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_4
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).
 */
public class Exercicio_4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[15];
    double[] vetorB = new double[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      int posicao = scan.nextInt();
      vetorA[i] = posicao;
      vetorB[i] =Math.sqrt(vetorA[i]);
    }

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Vetor A: " + vetorA[i]);
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Vetor B: " + vetorB[i]);
    }

    scan.close();

  }
}