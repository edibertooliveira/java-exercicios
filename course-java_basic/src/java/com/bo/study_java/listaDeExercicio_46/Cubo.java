package com.bo.study_java.listaDeExercicio_46;

public class Cubo extends Figura3D {
  private int lado;

  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

  @Override
  public double calcularVolume() {
    return Math.pow(this.getLado(), 3);
  }

  @Override
  public double calcularArea() {
    return 6 * Math.pow(this.getLado(), 2);
  }
}
