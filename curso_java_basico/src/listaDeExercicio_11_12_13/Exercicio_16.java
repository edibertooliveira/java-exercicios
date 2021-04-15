package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário
 */

public class Exercicio_16 {
  public static void main(String[] args) {
    double valorLata = 80.00;
    double lataDeTinta = 18;
    double metrosPorLitro = 3;

    DecimalFormat dinheiro = new DecimalFormat("0.00");
    Scanner scan = new Scanner(System.in);
    System.out.println("area quadrada a pintar: ");
    double area = scan.nextDouble();
    scan.close();

    double calc = Math.round((area * metrosPorLitro) / lataDeTinta);
    double valorPagar = calc * valorLata;

    System.out.println("Você vai precisa de: " +  calc + " lata(s), no valor de: " + dinheiro.format(valorPagar));
  
  }
  
}