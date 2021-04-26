package com.bo.study_java.listaDeExercicio_33;

public class Lampada {
  private String modelo;
  private String tensao;
  private int potencia;
  private String corLuz;
  private String tipoLuz;
  private int garantia;
  private String[] tipo;
  private boolean ligado = false;

  public Lampada(boolean ligado) {
    this.ligado = ligado;
  }

  public Lampada() {
  }

  public String[] getTipo() {
    return tipo;
  }

  public void setTipo(String[] tipo) {
    this.tipo = tipo;
  }

  public int getGarantia() {
    return garantia;
  }

  public void setGarantia(int garantia) {
    this.garantia = garantia;
  }

  public String getTipoLuz() {
    return tipoLuz;
  }

  public void setTipoLuz(String tipoLuz) {
    this.tipoLuz = tipoLuz;
  }

  public String getCorLuz() {
    return corLuz;
  }

  public void setCorLuz(String corLuz) {
    this.corLuz = corLuz;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public String getTensao() {
    return tensao;
  }

  public void setTensao(String tensao) {
    this.tensao = tensao;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public boolean istLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public String mudaEstado() {
    if (!istLigado()) {
      this.setLigado(true);
      return "Ligada";
    }
    this.setLigado(false);
    return "Desligada";
  }

  public String obterEstado() {
    String estado = this.ligado ? "Ligada" : "Desligada";
    return estado; 
  }
  
}
