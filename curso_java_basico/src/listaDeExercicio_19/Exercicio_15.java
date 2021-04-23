package curso_java_basico.src.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_15
 *Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
 */
public class Exercicio_15 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double[] vetorA = new double[10];

    int conteImpares = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();

      if(vetorA[i] % 2 > 0) {
        conteImpares += 1;
      }
    }

    int par = vetorA.length - conteImpares;
    System.out.println("Percentuals de pares: " + (( par * 100 ) / vetorA.length));
    System.out.println("Percentuals de impares: " +  (( conteImpares * 100 ) / vetorA.length));

    scan.close();

  }
}