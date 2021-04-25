package com.bo.study_java.listaDeExercicio_27;

/**
 * Exercicio_2 Cria uma classe para representar uma conta corrente que possui um
 * número, um saldo, um status que informa se ela é especial ou não, um limite.
 * Desenvolva métodos para realizar saque (verificando se o cliente pode
 * realizar saques), despositar dinheiro, consultar saldo e verificar se o
 * cliente está usando cheque especial ou não. Desenvolva um programa para
 * testar essa classe.
 * 
 */
public class Exercicio_2 {

  public static void main(String[] args) {
    ContaCorrente cc01 = new ContaCorrente();
    cc01.numero = "646871";
    cc01.agencia = "0624";
    cc01.especial = true;
    cc01.limiteEspecial = 500;
    cc01.saldo = 500;
    boolean saque520 = cc01.realizarSaque(520);

    System.out.println("Saque " + (saque520 ? "Realizado com sucesso" : "Rejeitado pela financeira"));

    System.out.println("Seu saldo é de " + cc01.obterSaldo());
    cc01.realizarDeposito(200);
    System.out.println("Seu saldo é de " + cc01.obterSaldo());
    
    if (cc01.verificarUsoChequeEspecial()) {
      System.out.println("Esta usando cheque especial");
    } else {
      System.out.println("Não esta usando cheque especial");
    }
  }

}