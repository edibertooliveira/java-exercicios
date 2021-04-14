package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Exercicio_05 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite as quatros notas do seu bimestre: ");
    double bimestre1 = scan.nextDouble();
    double bimestre2 = scan.nextDouble();
    double bimestre3 = scan.nextDouble();
    double bimestre4 = scan.nextDouble();
    scan.close();
    System.out.println("A média: " + ((bimestre1 + bimestre2 + bimestre3 + bimestre4)/4));
  }
}