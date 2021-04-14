package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */
public class Exercicio_07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o tamanho do lado do quadrado: ");
    double tamanhoDoQuadrado = scan.nextDouble();
    scan.close();
    double result = tamanhoDoQuadrado * tamanhoDoQuadrado;
    System.out.println("O dobro da area do quadrado eh: " + (result * 2) + "m²");
  }
  
}