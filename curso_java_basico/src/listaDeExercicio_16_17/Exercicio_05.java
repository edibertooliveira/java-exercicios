package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */

public class Exercicio_05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean estaLigado = true;

    while(estaLigado){
      boolean infoValido = false;
      double populacaoA = 0;
      double populacaoB = 0;
      double taxaA = 0;
      double taxaB = 0;
      int anos = 0;

      while(!infoValido) {
        System.out.println("Digite População A e B: \n");
        populacaoA = scan.nextDouble();
        populacaoB = scan.nextDouble();
        if(populacaoA < populacaoB) infoValido = true;
        else System.out.println("Campos invalidos! População A tem que ser menor que população B");
      }
      infoValido = false;
      while(!infoValido) {
        System.out.println("Digite a Taxa de crescimento A e B: \n");
        taxaA = scan.nextDouble();
        taxaB = scan.nextDouble();
        if(taxaA > taxaB) infoValido = true;
        else System.out.println("Campos invalidos! Taxa A tem que ser maior que Taxa B");
      }
        
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

      System.out.println("Deseja continuar? N-Não, S-Sim: ");
      String reiniciar = scan.next();
      if(reiniciar.equalsIgnoreCase("n")) {
        estaLigado = false;
        System.out.println("bye, bye!");
      } else {
        System.out.println("Vamos outra vez!");
      }
    }
    scan.close();
  }
}