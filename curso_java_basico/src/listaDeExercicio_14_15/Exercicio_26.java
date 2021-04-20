package curso_java_basico.src.listaDeExercicio_14_15;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro 

Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível 
(codificado da seguinte forma: A-álcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
 */

public class Exercicio_26 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite A-álcool, G-gasolina");
    String tipoCombustivel = scan.next().toUpperCase();
    System.out.println("Digite o valor");
    double litro = scan.nextDouble();
    scan.close();
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));

    if(tipoCombustivel.contains("G")) {
      double valorGasolina = 2.50;
      double taxaGasolinaCima = 6;
      double taxaGasolinaBaixo = 4;
      if (litro > 20) {
        double calcGasolinaValor = (litro * valorGasolina);
        double desconto = ((calcGasolinaValor / 100) * taxaGasolinaCima);
        System.out.println("Litro: " + litro + "l");
        System.out.println("Desconto: " + nf.format(desconto));
        System.out.println("Valor à pagar: " + nf.format(calcGasolinaValor - desconto));
      } else {
        double calcGasolinaValor = (litro * valorGasolina);
        double desconto = ((calcGasolinaValor / 100) * taxaGasolinaBaixo);
        System.out.println("Litro: " + litro + "l");
        System.out.println("Desconto: " + nf.format(desconto));
        System.out.println("Valor à pagar: " + nf.format(calcGasolinaValor - desconto));
      }
    } else if (tipoCombustivel.contains("A")){
      double valorAlcool = 1.90;
      double taxaAlcoolCima = 5;
      double taxaAlcoolBaixo = 3;
      if (litro > 20) {
        double calcAlcoolValor = (litro * valorAlcool);
        double desconto = ((calcAlcoolValor / 100) * taxaAlcoolCima);
        System.out.println("Litro: " + litro + "l");
        System.out.println("Desconto: " + nf.format(desconto));
        System.out.println("Valor à pagar: " + nf.format(calcAlcoolValor - desconto));
      } else {
        double calcAlcoolValor = (litro * valorAlcool);
        double desconto = ((calcAlcoolValor / 100) * taxaAlcoolBaixo);
        System.out.println("Litro: " + litro + "l");
        System.out.println("Desconto: " + nf.format(desconto));
        System.out.println("Valor à pagar: " + nf.format(calcAlcoolValor - desconto));
      }
    } else {
      System.out.println("Digite um tipo valido");
    }

  }
}