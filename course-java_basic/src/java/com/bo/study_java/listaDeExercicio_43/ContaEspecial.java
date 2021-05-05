package com.bo.study_java.listaDeExercicio_43;

public class ContaEspecial extends ContaBancaria {
  private double limite;

  public ContaEspecial(String nomeCliente, String numeroConta) {
    super(nomeCliente, numeroConta);
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(double valor) {
    double saldoComLimite = this.getSaldo() + limite;

    if (valor < saldoComLimite) {
      this.setSaldo(this.getSaldo() - valor);
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    String info = "ContaBancaria [\n";
    info += "Limite: " + getLimite() + "\n";
    info += "Saldo: " + this.getSaldo() + "\n]";
    return info;
  }
}
