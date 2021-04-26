package com.bo.study_java.listaDeExercicio_27;

import java.util.Scanner;

/**
 * Exercicio_4 Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva
 * uma classe para representar o Jogo da Velha. Desenvolva uma classe para
 * testar o Jogo.
 * 
 */
public class Exercicio_4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    JogoDaVelha jogoDaVelha = new JogoDaVelha();

    boolean ganhou = false;
    char sinal;
    int linha = 0, coluna = 0;

    System.out.println("_ JOGO DA VELHA _\n");
    System.out.println("Jogador 1 = X");
    System.out.println("Jogador 2 = O");

    while (!ganhou) {
      if (jogoDaVelha.vezJogador1()) {
        System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
        sinal = 'X';
      } else {
        System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
        sinal = 'O';
      }
      linha = valor("Linha", scan);
      coluna = valor("Coluna", scan);
      jogoDaVelha.validarJogada(--linha, --coluna, sinal);
      jogoDaVelha.imprimirTabuleiro();
      ganhou = ganhador(jogoDaVelha);

    }

  }

  static int valor(String tipoValor, Scanner scan) {
    int valor = 0;
    boolean valorValido = false;
    while (!valorValido) {
      System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
      valor = scan.nextInt();
      if (valor >= 1 && valor <= 3) {
        valorValido = true;
      } else {
        System.out.println("Entrada inválida, tente novamente");
      }
    }
    return valor;
  }

  static boolean ganhador(JogoDaVelha jogoDaVelha) {
    if (jogoDaVelha.verificarGanhador('X')) {
      System.out.println("Parabéns, jogador 1 ganhou!");
      return true;
    } else if (jogoDaVelha.verificarGanhador('O')) {
      System.out.println("Parabéns, jogador 2 ganhou!");
      return true;
    }
    return false; 
  }

  
}