package curso_java_basico.src.listaDeExercicio_19;

import java.util.Scanner;

/**
 * Exercicio_16 Criar um vetor A com 10 elementos inteiros. Escrever um programa
 * que calcule e escreva: a) a soma de elementos armazenados neste vetor que são
 * inferiores a 15; b) a quantidade de elementos armazenados no vetor que são
 * iguais a 15; e c) a média dos elementos armazenados no vetor que são
 * superiores a 15.
 */
public class Exercicio_16 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int somaMaiorQuinze = 0;
    int somaMenorQuinze = 0;
    int qtndMenorQuinze = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com o valor da posição: " + i);
      vetorA[i] = scan.nextInt();
      if (vetorA[i] < 15) somaMenorQuinze += vetorA[i];
      else if (vetorA[i] == 15) qtndMenorQuinze += 1;
      else somaMaiorQuinze += 1; 
    }

    System.out.print("Soma de elementos menores a 15: " + somaMenorQuinze);
      System.out.print("Quantidade de elementos iguais a 15: " + qtndMenorQuinze);
      System.out.print("media de elementos maiores a 15: " + (
        somaMaiorQuinze / vetorA.length));


    scan.close();

  }
}