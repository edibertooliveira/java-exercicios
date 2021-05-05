package com.bo.study_java.listaDeExercicio_43;

public class ContaBancaria {
  private String nomeCliente;
  private String numeroConta;
  private double saldo = 0;

  public ContaBancaria() {
  }
  public ContaBancaria(String nomeCliente, String numeroConta) {
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
  }
  public String getNomeCliente() {
    return nomeCliente;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }
  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void depositar(double valor) {
    setSaldo(getSaldo() + valor);
  }

  public boolean sacar(double valor) {
    if(valor > getSaldo()) {
      return false;
    }
    setSaldo(getSaldo() - valor);
    return true;
  }

  @Override
  public String toString() {
    String info = "ContaBancaria [\n";
    info += "nomeCliente: " + getNomeCliente() + "\n";
    info += "numeroConta: " + getNumeroConta() + "\n";
    info += "Saldo: " + getSaldo() + "\n]";
    return info;
  }
}
