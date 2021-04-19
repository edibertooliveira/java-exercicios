package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */

public class Exercicio_11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o M-matutino ou V-Vespertino ou N- Noturno: ");
    String turno = scan.next().toUpperCase();
    scan.close();
  
    if (turno.contains("M")){
      System.out.println("Bom dia");
    }
    else if (turno.contains("V")) {
      System.out.println("Boa tarde");
    } 
    else{
      System.out.println("Boa noite");
    } 
  }
}