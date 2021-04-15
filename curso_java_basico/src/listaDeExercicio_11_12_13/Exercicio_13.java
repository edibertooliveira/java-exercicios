package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */

public class Exercicio_13 {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite sua altura e idade :");
    
    double altura = scan.nextDouble();
    int idade = scan.nextInt();
    scan.close();

    double alturaIdealM = (72.7 * altura) - idade;
    double alturaIdealF = (62.1 * altura) - idade;

    System.out.println("peso ideal é :" + alturaIdealM + " para homens" + alturaIdealF + " para mulheres");

  }
  
}