package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * A
série
de
Fibonacci
é
formada
pela
seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */

public class Exercicio_15 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com o limite de fibonacci");
    int num = scan.nextInt();

    int num1 = 1, num2 = 1, proximo;
        
    System.out.println(num1);
    System.out.println(num2);
    
    for(int i = 3; i < num; i++){
        proximo = num1 + num2;
        num1 = num2;
        num2 = proximo;
        System.out.println(proximo);
    }
    scan.close();
  }
}