package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

public class Exercicio_15 {
  public static void main(String[] args) {
    DecimalFormat dinheiro = new DecimalFormat("0.00");
    Scanner scan = new Scanner(System.in);
    double dependente = 189.59;
    System.out.println("Digite salario Bruto :");
    double salarioBruto = scan.nextDouble();
    double INSS = (salarioBruto/100) * 14;
    double IRRF = ((INSS + dependente)/100) * 15;
    double trybe = (salarioBruto/100) * 17;
    double salarioLiquido = salarioBruto - (IRRF + INSS + trybe);
    scan.close();
    System.out.println(
      "valor liquido é :" + dinheiro.format(salarioLiquido)
      );
    System.out.println(
      "taxas : IR: " + dinheiro.format(IRRF) + 
      " INSS: " + dinheiro.format(INSS) + 
      " Trybe: " + dinheiro.format(trybe)
      );
    }
  
}