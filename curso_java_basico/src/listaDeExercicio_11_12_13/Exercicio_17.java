package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.
 */

public class Exercicio_17 {

  public static void main(String[] args) {
    double valorLata = 80.00;
    double lataDeTinta = 18;

    double valorGalao = 25.00;
    double galaoDeTinta = 3.6;

    double metrosPorLitro = 6;

    DecimalFormat dinheiro = new DecimalFormat("0.00");
    Scanner scan = new Scanner(System.in);
    System.out.println("area quadrada a pintar: ");
    double area = scan.nextDouble();
    scan.close();

    double calc01 = Math.round((area * metrosPorLitro) / lataDeTinta);
    double calc02 = Math.round((area * metrosPorLitro) / galaoDeTinta);
    double valorPagar01 = calc01 * valorLata;
    double valorPagar02 = calc02 * valorGalao;

    System.out.println("Você vai precisa de: " +  calc01 + " lata(s), no valor de: " + dinheiro.format(valorPagar01));
    System.out.println("Você vai precisa de: " +  calc02 + " lata(s), no valor de: " + dinheiro.format(valorPagar02));
  
  }
  
}