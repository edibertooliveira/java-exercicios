package com.bo.study_java.listaDeExercicio_46;

public class Cilindro extends Figura3D {
  private double altura;
  private double raio;
  public double getRaio() {
    return raio;
  }
  public double getAltura() {
    return altura;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  public void setRaio(double raio) {
    this.raio = raio;
  }
  @Override
  public double calcularVolume() {
    return Math.PI * Math.pow(this.getRaio(), 2) * this.getAltura();
  }
  @Override
  public double calcularArea() {
    double areaBase = Math.PI * Math.pow(this.getRaio(), 2);
    double areaLateral = (2 * (Math.PI * this.getRaio())) * this.getAltura();
    return (2 * areaBase) + areaLateral;
  }
}
