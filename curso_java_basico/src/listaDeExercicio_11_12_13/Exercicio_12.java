package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */

public class Exercicio_12 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite sua altura :");
    
    double altura = scan.nextDouble();
    scan.close();

    double alturaIdeal = (72.7 * altura) - 58;

    System.out.println("seu peso ideal é :" + alturaIdeal);

  }
  
}