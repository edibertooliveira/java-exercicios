package curso_java_basico.src.listaDeExercicio_14_15;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg
Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

public class Exercicio_27 {
  public static void main(String[] args) {
    double valorFrutaMorango = 2.50;
    double valorFrutaMaca = 1.80;
    
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos Kilos de Morangos: ");
    double morangoKG = scan.nextDouble();
    System.out.println("Quantos Kilos de Maça : ");
    double macaKG = scan.nextDouble();
    scan.close();

    double totalMorango = valorFrutaMorango * morangoKG;
    double totalMaca = valorFrutaMaca * macaKG;
    double valorTotal = totalMorango + totalMaca;

    if(morangoKG <= 5) {
      valorFrutaMorango = 2.20;
      totalMorango = valorFrutaMorango * morangoKG;
    }
    if(macaKG <= 5) {
      valorFrutaMaca = 1.50;
      totalMaca = valorFrutaMaca * macaKG;
    }
    
    if (morangoKG + macaKG >= 8 || valorTotal >= 25) {
      double desconto = ((valorTotal / 100) * 10);
      valorTotal = (valorTotal - desconto);
      System.out.println("Valor a pagar em Morangos: " + nf.format(totalMorango));
      System.out.println("Valor a pagar em Maçãs: " + nf.format(totalMaca));
      System.out.println("Desconto: " + nf.format(desconto));
      System.out.println("Valor a pagar: " + nf.format(valorTotal));
    } else {
      System.out.println("Valor a pagar em Morangos: " + nf.format(totalMorango));
      System.out.println("Valor a pagar em Maçãs: " + nf.format(totalMaca));
      System.out.println("Valor a pagar: " + nf.format(valorTotal));
    }
  }
}