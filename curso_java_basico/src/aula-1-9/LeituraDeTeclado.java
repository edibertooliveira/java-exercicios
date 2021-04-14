
import java.util.Scanner;

public class LeituraDeTeclado {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /* System.out.println("Escreva seu nome: ");
    String nomeDigitado = scan.next();
    System.out.println("Seu nome é " + nomeDigitado); */
    System.out.println("Digite um numero: ");
    int primeiroNumero = scan.nextInt();
    System.out.println("Digite um numero: ");
    int segundoNumero = scan.nextInt();
    int result = primeiroNumero + segundoNumero;
    System.out.println("resultado é: " + result);
  }
}
