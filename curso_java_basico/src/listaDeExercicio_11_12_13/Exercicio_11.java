package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.util.Scanner;

/**
 * Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */

public class Exercicio_11 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println( "Digite 2 números inteiros e um número real :");
      int primeiroNumero = scan.nextInt();
      int segundoNumero = scan.nextInt();
      double terceiroNumero = scan.nextDouble();
      scan.close();

      int primeiroResultado = (primeiroNumero * 2) * (segundoNumero / 2);
      double segundoResultado = (primeiroNumero * 3) + terceiroNumero;
      double terceiroResultado = Math.pow(primeiroNumero, 3);

      System.out.println("a. :" + primeiroResultado);
      System.out.println("b. :" + segundoResultado);
      System.out.println("c. :" + terceiroResultado);

    }
  
}