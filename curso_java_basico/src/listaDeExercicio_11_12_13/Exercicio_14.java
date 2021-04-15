package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 */

public class Exercicio_14 {
  public static void main(String[] args) {
  double quiloLimite = 50;
  double taxaPorQuilo = 4.00;

  Scanner scan = new Scanner(System.in);
    System.out.println("Digite peso do peixe :");
    
    double peixeQuilo = scan.nextDouble();
    scan.close();

    double taxaQuilo = (peixeQuilo - quiloLimite) * taxaPorQuilo;
    System.out.println("valor a pagar é :" + taxaQuilo);

  }
}