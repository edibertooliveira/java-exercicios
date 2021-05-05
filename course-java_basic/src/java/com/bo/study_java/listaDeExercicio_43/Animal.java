package com.bo.study_java.listaDeExercicio_43;

public class Animal {
  private String nome;
  private double tamanho;
  private int numeroPatas;
  private String cor;
  private String ambiente;
  private double velocidade;

  public Animal() {
    this.numeroPatas = 4;
  }

  public String getNome() {
    return nome;
  }
  public double getVelocidade() {
    return velocidade;
  }
  public void setVelocidade(double velocidade) {
    this.velocidade = velocidade;
  }
  public String getAmbiente() {
    return ambiente;
  }
  public void setAmbiente(String ambiente) {
    this.ambiente = ambiente;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public int getNumeroPatas() {
    return numeroPatas;
  }
  public void setNumeroPatas(int numeroPatas) {
    this.numeroPatas = numeroPatas;
  }
  public double getTamanho() {
    return tamanho;
  }
  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("_____________\n");
    builder.append("Nome: " + this.getNome());
    builder.append("\nComprimento: " + this.getTamanho());
    builder.append("\nPatas: " + this.getNumeroPatas());
    builder.append("\nCor: " + this.getCor());
    builder.append("\nAmbiente: " + this.getAmbiente());
    builder.append("\nVelocidade: " + this.getVelocidade() + "em m/s");
    return builder.toString();
  }
}
