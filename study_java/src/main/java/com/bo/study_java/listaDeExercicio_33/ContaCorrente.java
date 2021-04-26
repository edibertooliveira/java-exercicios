package com.bo.study_java.listaDeExercicio_33;

public class ContaCorrente {
  private String numero;
  private String agencia;
  private boolean especial;
  private double limiteEspecial;
  private double contaEspecialUsado;
  private double saldo;

  public ContaCorrente() {
  }

  public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial,
      double contaEspecialUsado, double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.especial = especial;
    this.limiteEspecial = limiteEspecial;
    this.contaEspecialUsado = contaEspecialUsado;
    this.saldo = saldo;
  }

  public boolean realizarSaque(double quantiaASacar) {
    if (getSaldo() >= quantiaASacar) {
      setSaldo(getSaldo() - quantiaASacar);
      return true;

    } else if (isEspecial()) {
      double limite = getLimiteEspecial() + getSaldo();
      if (limite >= quantiaASacar) {
        setSaldo(getSaldo() - quantiaASacar);
        return true;
      }
      return false;
    }
    return false;
  }

  public double getContaEspecialUsado() {
    return contaEspecialUsado;
  }

  public void setContaEspecialUsado(double contaEspecialUsado) {
    this.contaEspecialUsado = contaEspecialUsado;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public boolean isEspecial(){
    return especial;
  }

  public void setEspecial(boolean especial){
    this.especial = especial;
  }

  public double getLimiteEspecial(){
    return limiteEspecial;
  }

  public void setLimiteEspecial(double limiteEspecial){
    this.limiteEspecial = limiteEspecial;
  }

  public void realizarDeposito(double quantiaASacar) {
    setSaldo(getSaldo() + quantiaASacar);
  }

  boolean verificarUsoChequeEspecial() {
    if (getSaldo() < 0) {
      return true;
    }
    return false;
  }

}
