package com.bo.study_java.listaDeExercicio_43;

public abstract class Contribuinte {
  private String nome;
  public Contribuinte(String nome, double rendaBruta) {
    this.nome = nome;
    this.rendaBruta = rendaBruta;
  }

  private double rendaBruta;

  public String getNome() {
    return nome;
  }
  public double getRendaBruta() {
    return rendaBruta;
  }
  public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract double calcularImposto();
  
}
