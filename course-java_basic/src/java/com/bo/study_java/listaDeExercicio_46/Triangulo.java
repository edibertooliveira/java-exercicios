package com.bo.study_java.listaDeExercicio_46;

public class Triangulo extends Figura2D {
  private double base;
  private double altura;
  public double getAltura() {
    return altura;
  }
  public double getBase() {
    return base;
  }
  public void setBase(double base) {
    this.base = base;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  @Override
  public double calcularArea() {
    return (this.getAltura() * this.getBase()) / 2;
  }
  
}
