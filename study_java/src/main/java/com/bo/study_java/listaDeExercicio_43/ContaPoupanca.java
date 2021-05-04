package com.bo.study_java.listaDeExercicio_43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
  private int diaRendimento;

  public ContaPoupanca(String nomeCliente, String numeroConta, int diaRendimento) {
    super(nomeCliente, numeroConta);
    this.diaRendimento = diaRendimento;
  }

  public int getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public boolean calcularNovoSaldo(double taxaRedimento) {
    Calendar hoje = Calendar.getInstance();
    if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
      this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRedimento));
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    String info = "ContaPoupança [\n";
    info += "diaRendimento: " + getDiaRendimento() + "\n";
    info += "]\n";
    return info;
  }

}
