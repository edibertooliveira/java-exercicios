package com.bo.study_java.listaDeExercicio_43;

/**
 * Exercicio_1
 */
public class Exercicio_1 {

  public static void main(String[] args) {
    // ContaBancaria cliete01 = new ContaBancaria("Tomas", "1005");
    // ContaPoupanca cliete01 = new ContaPoupanca("Tomas", "1005", 3);
    ContaEspecial cliete01 = new ContaEspecial("Tomas", "1005");
    cliete01.setLimite(100);
    cliete01.depositar(200);
    // cliete01.getDiaRendimento();
    realizarSaque(cliete01, 250);

    // if(cliete01.calcularNovoSaldo(0.5)) {
    //   System.out.println("Rendimento aplicado, novo saldo é de = " + cliete01.getSaldo());
    // } else {
    //   System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
    // }
    
  }

  private static void realizarSaque(ContaBancaria conta, double valor) {
    if(conta.sacar(valor)) {
      System.out.println("Saque efetuado com sucesso!");
    } else {
      System.out.println("Saque insuficiente!");

    }
    System.out.println(conta);
  }
}