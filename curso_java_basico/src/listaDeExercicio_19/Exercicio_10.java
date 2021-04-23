package curso_java_basico.src.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_10
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.	
  	
  
C[i] = A[i] / float(B[i]).
 */
public class Exercicio_10 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[8];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      int posicao = scan.nextInt();
      vetorA[i] = posicao;
      vetorB[i] = vetorA[i] % 2;
    }

    for (int i = 0; i < vetorB.length; i++) {
      System.out.print("Vetor A: " + vetorA[i]);
      System.out.print("Vetor B: " + vetorB[i]);
    }

    scan.close();

  }
}