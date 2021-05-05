package com.bo.study_java.listaDeExercicio_46;

public class Circulo extends Figura2D {
  private double raio;

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.pow(this.getRaio(), 2) * Math.PI;
  }

  
}
