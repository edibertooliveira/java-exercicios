package curso_java_basico.src.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
o
o
o
o
Até 5 Kg
Acima de 5 Kg
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o preco a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preço preco, tipo de pagamento, valor do
desconto e valor a pagar.
 */

public class Exercicio_28 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite três notas:");

    System.out.println("1- File Duplo\n2- Alcatra\n3- Picanha\n");
    int tipo = scan.nextInt();
    System.out.println("Quantidade: \n");
    int quantidade = scan.nextInt();
    System.out.println("\n0- Dinheiro\n1- Cartâo\n");
    int cartao = scan.nextInt();
    scan.close();

    String nome = "";
    double preco = 0;
    double total = 0;
    String eDesconto = "Não";

    if(tipo == 1) {
      nome = "File Duplo";
      if (quantidade > 5) preco = 5.80 * quantidade;
      else preco = 4.90 * quantidade;
    }
    if(tipo == 2) {
      nome = "Alcatra";
      if (quantidade > 5) preco = 6.80 * quantidade;
      else preco = 5.90 * quantidade;
    }
    if(cartao == 1) {
      eDesconto = "Sim";
      total =  preco - ((preco / 100) * 5);
      if (quantidade > 5) preco = 7.80 * quantidade;
      else preco = 6.90 * quantidade;
    }

    System.out.println("\n***************************CUPOM FISCAL**************************************");
    System.out.println("* Carne.......................................................... %s " + nome);
    System.out.println("* Quantidade..................................................... %d KG " + quantidade);
    System.out.println("* Preço......................................................... %2.f R$ "  + preco);
    System.out.println("* Cartao Tabajara................................................ %s " + eDesconto);
    System.out.println("* preco com desconto............................................ %2.f R$ " + total);
    System.out.println("******************************************************************************");
  }
}