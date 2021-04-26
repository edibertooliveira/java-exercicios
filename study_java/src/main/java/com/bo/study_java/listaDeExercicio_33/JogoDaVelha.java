package com.bo.study_java.listaDeExercicio_33;

public class JogoDaVelha {
  
  private char[][] jogoVelha;
  private int jogada;

  public JogoDaVelha(char[][] jogoVelha, int jogada) {
    this.jogoVelha = jogoVelha;
    this.jogada = jogada;
  }

  public JogoDaVelha() {
    jogoVelha = new char[3][3];
    jogada = 1;
  }

  public boolean vezJogador1() {
    if (jogada % 2 == 1) { 
      return true;
    } 
    return false;
  }

  public boolean validarJogada(int linha, int coluna, char sinal) {
    if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
      return false;
    }
    jogoVelha[linha][coluna] = sinal;
    jogada++;
    return true;
  }

  public void imprimirTabuleiro() {
    for (int i = 0; i < jogoVelha.length; i++) {
      for (int j = 0; j < jogoVelha[i].length; j++) {
        System.out.print(jogoVelha[i][j] + " | ");
      }
      System.out.println();
    }
  }

  public boolean verificarGanhador(char sinal) {
    if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
    (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || 
    (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || 
    (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || 
    (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || 
    (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || 
    (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||
    (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {
      return true;
    }
    return false;
  }
}
