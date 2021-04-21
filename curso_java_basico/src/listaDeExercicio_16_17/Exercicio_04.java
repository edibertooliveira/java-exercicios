package curso_java_basico.src.listaDeExercicio_16_17;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_04 {
  public static void main(String[] args) {
    double populacaoA = 80000;
    double populacaoB = 200000;
    double taxaA = 3.0;
    double taxaB = 1.5;

    int anos = 0; 
    do {
      populacaoA = (((populacaoA / 100) * taxaA) + populacaoA);
      populacaoB = (((populacaoB / 100) * taxaB) + populacaoB);
      anos += 1;

    } while(populacaoB > populacaoA );

    if (anos > 1) {
      System.out.println(
        "Em: " + anos + 
        " anos, " + 
        " População de: \nA " + Math.round(populacaoA) + 
        ", \nB " + Math.round(populacaoB));
    } else {
      System.out.println(
        "Em: " + anos + 
        " ano, " + 
        " População de: A " + Math.round(populacaoA) + 
        ", B " + Math.round(populacaoB));
    }
  }
}