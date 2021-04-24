package curso_java_basico.src.listaDeExercicio_20;

import java.util.Scanner;

/**
 * Exercicio_3
 * Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.
 */
public class Exercicio_3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] matrizM = new int[3][3];

    int pares = 0;
    int impares = 0;

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        System.out.print(matrizM[i][j] + "Entre com a chave da posicao: ");
        matrizM[i][j] = scan.nextInt();
          if (matrizM[i][j] % 2 == 0) {
            pares += 1 ;
          } 
          if (matrizM[i][j] % 2 > 0) {
            impares += 1 ;
          }
      }
    }

    for (int i = 0; i < matrizM.length; i++) {
      for (int j = 0; j < matrizM[i].length; j++) {
        System.out.print(matrizM[i][j] + " ");
      }
      System.out.println("");
    }
    scan.close();

    System.out.println("Quantidade pares " + pares);
    System.out.println("Quantidade impares " + impares);
  }
}