package curso_java_basico.src.listaDeExercicio_11_12_13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */

public class Exercicio_18 {
  public static void main(String[] args) {
    int valorEmMinutos = 60;
    DecimalFormat tempo = new DecimalFormat("00");
    Scanner scan = new Scanner(System.in);

    System.out.println("Tamanho do arquivo (MB): ");
    double tamanhoDoArquivo = scan.nextDouble();
    System.out.println("Velocidade de Internet (MBps): ");
    double velocidadeDeInternet = scan.nextDouble();
    
    scan.close();

    double segundo = tamanhoDoArquivo / velocidadeDeInternet;
    double minutos = segundo / valorEmMinutos;
    double segundos = segundo % valorEmMinutos;


    System.out.println("resta apenas " + tempo.format(minutos) + ":" + tempo.format(segundos) + " minutos");
  
  }
  
}