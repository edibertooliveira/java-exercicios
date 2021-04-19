package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.
 */

public class Exercicio_18 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("digite uma data com o seguinte formato dd/mm/aaaa ---> ");
    String[]  data = scan.next().split("/");
    int dia = Integer.parseInt(data[0]);
    int mes = Integer.parseInt(data[1]);
    int ano = Integer.parseInt(data[2]);
    scan.close();
    System.out.println(dia + " " + mes  + " " + ano);

    boolean eValido = false;
    boolean eBissexto = ano % 4 == 0 && ano % 100 == 0;
    
    if (mes == 4 
    || mes == 6 
    || mes == 9 
    || mes == 11) {
      if (dia > 0 && dia <= 30)  eValido = true;
    } else if (mes == 1 
    || mes == 3 
    || mes == 5 
    || mes == 7 
    || mes == 8 
    || mes == 10 
    || mes == 12) {
      if (dia > 0 && dia <= 31) eValido = true;
    } else if (mes == 2) {
      if (eBissexto && dia > 0 && dia <= 29){
        eValido = true;
      }
      if (dia > 0 && dia <= 28) {
        eValido = true;
      }
    }

    if (eValido) System.out.println("Data válida");
    else System.out.println("inválida");
  }
}